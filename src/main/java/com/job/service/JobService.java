package com.job.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.job.entity.HsCustBillingInfo;
import com.job.entity.HsCustJobboard;
import com.job.entity.HsCustomerMaster;
import com.job.entity.HsDefaultJobFilterQaOptionMaster;
import com.job.entity.HsJobBoardMaster;
import com.job.entity.HsJobCouponCode;
import com.job.entity.HsJobFilterKeywordMaster;
import com.job.entity.HsJobMaster;
import com.job.entity.HsTransactionMaster;
import com.job.entity.HsdefaultJobFilterQaMaster;
import com.job.exception.JobServiceException;
import com.job.repository.CouponCodeRepository;
import com.job.repository.CustomerJobBoardRepository;
import com.job.repository.JobBoardMasterRepository;
import com.job.repository.JobBoardPaidAmountRepository;
import com.job.repository.JobFilterKeywordRepository;
import com.job.repository.JobFilterQuestionOptionRepository;
import com.job.repository.JobFilterQuestionRepository;
import com.job.repository.PostJobRepository;
import com.job.repository.TransactionMasterRepository;
import com.job.repository.UserRepository;
import com.job.request.model.Filter;
import com.job.request.model.JobBoard;
import com.job.request.model.JobDescription;
import com.job.request.model.ProcessPayment;
import com.job.utility.JobUtility;


@Service
public class JobService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JobService.class);
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	PostJobRepository postJobRepository;
	@Autowired
	JobMapper postJobMapper;
	@Autowired
	JobFilterKeywordRepository jobFilterKeywordRepository;
	@Autowired
	JobFilterQuestionRepository jobFilterQuestionRepository;
	@Autowired
	JobFilterQuestionOptionRepository jobFilterQuestionOptionRepository;
	@Autowired
	CustomerJobBoardRepository customerJobBoardRepository;
	@Autowired
	JobBoardPaidAmountRepository jobBoardPaidAmountRepository;
	@Autowired
	JobBoardMasterRepository jobBoardMasterRepository;
	@Autowired
	CouponCodeRepository couponCodeRepository;

	@Autowired
	TransactionMasterRepository transactionMasterRepository;

	public HsJobMaster createJobDescription(JobDescription jobDescription) throws JobServiceException {

		postJobMapper.jobDescrptiondtoToEntity(jobDescription);

		return postJobRepository.save(postJobMapper.jobDescrptiondtoToEntity(jobDescription));

	}
	
	

//	/* Save Keyword and Match */

	public HsJobFilterKeywordMaster filterByKeyword(Filter filter) throws JobServiceException  {

		return jobFilterKeywordRepository.save(postJobMapper.filterKeyworddtoToEntity(filter));

	}

	public HsdefaultJobFilterQaMaster filterQuestionType(Filter filter) {
		
		LOGGER.info("-------------------Started filterQuestionType----------------");

		HsdefaultJobFilterQaMaster questionTitle = jobFilterQuestionRepository
				.save(postJobMapper.filterQuestiondtoToEntity(filter));

		if (!ObjectUtils.isEmpty(filter.getFilterYesOrNo())) {

			HsDefaultJobFilterQaOptionMaster QaoptionValue = postJobMapper.filterQuestionOptionValue(filter);

			String answer = QaoptionValue.getOptionValue();

			QaoptionValue.setHsdefaultJobFilterQaMaster(questionTitle);
			QaoptionValue.setOptionValue(answer);
			
			QaoptionValue.setStatus(JobUtility.JOBSTATUS_DRAFT_ID);
			
			QaoptionValue.setCorrectAnswer(Boolean.TRUE);
			QaoptionValue.setDefaultOptionId(2);

			jobFilterQuestionOptionRepository.save(QaoptionValue);
			
			LOGGER.info("------------------ ended filterQuestionType ----------------");

		}
      
		
		if (filter.getFilterFreeForm() != null) {

			questionTitle = postJobMapper.filterFreeFormQuestiondtoToEntity(filter);

		}
		//return questionTitle;
	
		LOGGER.error("Missing mandatory field either of the FilterFreeForm or FilterYesOrNo");
		return questionTitle;

//		throw new JobServiceException("Missing  field  either of the FilterFreeForm or FilterYesOrNo",
//				HttpStatus.BAD_REQUEST);

	}

	/* checkedFreeJobBoard */

	public HsJobMaster setFreeJobBoard(JobBoard jobBoard) throws JobServiceException{

		return postJobRepository.save(postJobMapper.getFreeJobBoard(jobBoard));
	}

	/* paidJobBoard */

	public void getPaymentByJobBoardId(JobBoard jobBoard) throws JobServiceException {
		Double amount = 0.00;
		
		if(!ObjectUtils.isEmpty(jobBoard.getPaidJobBoardId())) {

		List<HsJobBoardMaster> hsJobBoardMasterList = jobBoardPaidAmountRepository
				.findPaymentAmtByJobBoardId(jobBoard.getPaidJobBoardId());

		for (HsJobBoardMaster hsJobBoardMaster : hsJobBoardMasterList) {
		
			List<HsCustJobboard> hsCustJobboardList = customerJobBoardRepository
					.findByJobBoardId(hsJobBoardMaster.getJobBoardId());

			for (HsCustJobboard hsCustJobboard : hsCustJobboardList) {
				
				amount +=  hsJobBoardMaster.getPaymentAmt();

				hsCustJobboard.setJobboardRate(hsJobBoardMaster.getPaymentAmt());
				//set status as draft
				customerJobBoardRepository.save(hsCustJobboard);
			}
			
			

		}}
		LOGGER.error("Missing Paid Job Board");
		throw new JobServiceException("Paid Job Board Not found", HttpStatus.BAD_REQUEST);
				

	
		}
	

	

//	/* apply coupon discount */
//
	public HsJobCouponCode getDiscountByCoupon(JobBoard jobBoard) throws JobServiceException  {

		Double amount = 0.00;
		boolean paidJobBoarExists = false;
		boolean couponCodeUsed = false;
		String paidJobBoardName = "";
		HsJobBoardMaster hsJobBoardMaster = new HsJobBoardMaster();
		HsJobCouponCode hsCouponCode = new HsJobCouponCode();
		HsJobMaster hsJobMaster = new HsJobMaster();
        amount =  hsJobBoardMaster.getPaymentAmt();

		String couponCode = jobBoard.getCouponCode();

		if (!ObjectUtils.isEmpty(jobBoard.getCouponCode())) {

			List<HsJobCouponCode> hsJobCouponCodeList = couponCodeRepository.findDiscountByCouponCode(couponCode);

			for (HsJobCouponCode hsJobCouponCode : hsJobCouponCodeList) {

				Integer discountAmount = hsJobCouponCode.getDiscountAmount();

				if (jobBoard.getPaidJobBoardId().equals(JobUtility.JOBBOARD_CRAIGSLIST_ID)
						&& (hsCouponCode.getDiscountBoardCraigslist()))

					amount -= discountAmount.doubleValue();
				hsJobMaster.setCouponCode(hsCouponCode.getCode());
				couponCodeUsed = true;

			}

			if (hsJobBoardMaster.getJobBoardId().equals(JobUtility.JOBBOARD_INDEED_NAME)
					&& (hsCouponCode.getDiscountBoardCraigslist()))

			{
				amount -= hsCouponCode.getDiscountAmount().doubleValue();
				hsJobMaster.setCouponCode(hsCouponCode.getCode());
				couponCodeUsed = true;

			}
			if (hsJobBoardMaster.getJobBoardId().equals(JobUtility.JOBBOARD_LINKED_IN_NAME)
					&& (hsCouponCode.getDiscountBoardCraigslist()))

			{
				amount -= hsCouponCode.getDiscountAmount().doubleValue();
				hsJobMaster.setCouponCode(hsCouponCode.getCode());
				couponCodeUsed = true;

			}
			if (hsJobBoardMaster.getJobBoardId().equals(JobUtility.JOBBOARD_ZIP_RECRUITER_NAME)
					&& (hsCouponCode.getDiscountBoardCraigslist()))

			{
				amount -= hsCouponCode.getDiscountAmount().doubleValue();
				hsJobMaster.setCouponCode(hsCouponCode.getCode());
				couponCodeUsed = true;

			}
			paidJobBoarExists = true;
			paidJobBoardName += ", " + hsJobBoardMaster.getJobBoardName();

		}

		return null;

	}

	public boolean isPaymentSuccess(ProcessPayment processPayment) throws Exception {
		HsCustomerMaster hsCustomerMaster = new HsCustomerMaster();
		HsTransactionMaster hsTransactionMaster = new HsTransactionMaster();

		Long custId = processPayment.getCustId();
		Double amount = processPayment.getAmount();
		Integer processType = processPayment.getPaymentType();

		HsCustBillingInfo hsBillingInfo = new HsCustBillingInfo();

		String ProfileId = hsBillingInfo.getAuthorizeProfileId();
		String PaymentId = hsBillingInfo.getAuthorizePaymentId();
		hsBillingInfo.setAuthorizePaymentId(ProfileId);
		hsBillingInfo.setAuthorizePaymentId(PaymentId);

		hsTransactionMaster.setTransAmt(amount);
		hsTransactionMaster.setHsCustomerMaster(hsCustomerMaster);
		hsTransactionMaster.setProcessType(processType);
		transactionMasterRepository.save(hsTransactionMaster);

		return true;
	}}

