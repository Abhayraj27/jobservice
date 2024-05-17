package com.job.service;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.job.entity.HsCompanyMaster;
import com.job.entity.HsCraigslist;
import com.job.entity.HsDefaultJobFilterQaOptionMaster;
import com.job.entity.HsJobCategoryMaster;
import com.job.entity.HsJobFilterKeywordMaster;
import com.job.entity.HsJobMaster;
import com.job.entity.HsUser;
import com.job.entity.HsdefaultJobFilterQaMaster;
import com.job.exception.JobServiceException;
import com.job.repository.CompanyRepository;
import com.job.request.model.Filter;
import com.job.request.model.Filter.FilterFreeForm;
import com.job.request.model.Filter.FilterYesOrNo;
import com.job.request.model.JobBoard;
import com.job.request.model.JobDescription;
import com.job.utility.JobUtility;

@Component
public class JobMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(JobMapper.class);

	@Autowired
	CompanyRepository companyRepository;

	public HsJobMaster jobDescrptiondtoToEntity(JobDescription jobDescription) throws JobServiceException {

		LOGGER.info("-------------------Started jobDescrptiondtoToEntity----------------");

		if (!ObjectUtils.isEmpty(jobDescription.getJobTitle())
				&& !ObjectUtils.isEmpty(jobDescription.getJobDetails())) {

			HsJobMaster hsMasterEntity = new HsJobMaster();

			HsJobCategoryMaster hsJobCategoryMaster = new HsJobCategoryMaster();

			hsJobCategoryMaster.setJobCatId(jobDescription.getJobCategoryId());
			hsMasterEntity.setHsJobCategoryMaster(hsJobCategoryMaster);
			HsUser user = new HsUser();
			user.setUserId(jobDescription.getHiringManagerId());
			hsMasterEntity.setUser(user);

			hsMasterEntity.setJobTitle(jobDescription.getJobTitle());
			hsMasterEntity.setJobCode(jobDescription.getJobCode());
			hsMasterEntity.setJobDesc(jobDescription.getJobDetails());
			hsMasterEntity.setCity(jobDescription.getLocation().getCity());
			hsMasterEntity.setState(jobDescription.getLocation().getState());
			hsMasterEntity.setZipcode(jobDescription.getLocation().getZipcode());

			hsMasterEntity.setJobSalaryType(JobUtility.JOBSALARY_ANNUAL_ID);

			hsMasterEntity.setFreeJobboard(Boolean.FALSE);
			hsMasterEntity.setExternalId("1234");
			hsMasterEntity.setCraigAmount(578L);
			hsMasterEntity.setZipLatitude(11);
			hsMasterEntity.setZipLongitude(12);
			hsMasterEntity.setVoiceMessageOptIn(Boolean.FALSE);
			hsMasterEntity.setVoiceMessageRecorded(Boolean.FALSE);

			Integer companyId = jobDescription.getCompanyId();
			HsCompanyMaster company = companyRepository.findByCompanyId(companyId);
			hsMasterEntity.setCompanyName(company.getCompanyName());
			hsMasterEntity.setCustId(company.getCustId());
			hsMasterEntity.setCompanyLogo(company.getCompanyLogo());
			hsMasterEntity.setAboutCompany(company.getAboutCompany());
			hsMasterEntity.setLinkedinCompanyUrl(company.getLinkedinCompanyUrl());
			hsMasterEntity.setStatus(JobUtility.JOBSTATUS_DRAFT_ID);

			LOGGER.info("status is draft : {}", JobUtility.JOBSTATUS_DRAFT_ID);
			
			LOGGER.info("-------------------ended jobDescrptiondtoToEntity----------------");

			return hsMasterEntity;

		}

		LOGGER.error("Missing mandatory field either of the jobTitle or joDetails");

		throw new JobServiceException("Missing mandatory field either of the jobTitle or joDetails",
				HttpStatus.BAD_REQUEST);

	}

	public HsJobFilterKeywordMaster filterKeyworddtoToEntity(Filter filter) throws JobServiceException {

		HsJobFilterKeywordMaster hsJobFilterKeywordMasterEntity = new HsJobFilterKeywordMaster();
		hsJobFilterKeywordMasterEntity.setKeyName(filter.getFilterkeyword().getKeyword());

		hsJobFilterKeywordMasterEntity.setMatchCriteria(JobUtility.MatchEnum.FULLMATCH.getMatchId());
		hsJobFilterKeywordMasterEntity.setMatchCriteria(JobUtility.MatchEnum.PARTIALMATCH.getMatchId());
		hsJobFilterKeywordMasterEntity.setStatus(JobUtility.JOBSTATUS_DRAFT_ID);

		hsJobFilterKeywordMasterEntity.setDefaultKeyId(1);

		return hsJobFilterKeywordMasterEntity;

	}

	public HsdefaultJobFilterQaMaster filterQuestiondtoToEntity(Filter filter) {

		FilterYesOrNo filteryesNo = new FilterYesOrNo();

		filteryesNo = filter.getFilterYesOrNo();

		HsdefaultJobFilterQaMaster hsdefaultJobFilterQaMasterEntity = new HsdefaultJobFilterQaMaster();

		hsdefaultJobFilterQaMasterEntity.setQaTitle(filteryesNo.getQuestion());
		hsdefaultJobFilterQaMasterEntity.setFilterId(11);
		hsdefaultJobFilterQaMasterEntity.setStatus(JobUtility.JOBSTATUS_DRAFT_ID);
		hsdefaultJobFilterQaMasterEntity.setTypeId(1);

		return hsdefaultJobFilterQaMasterEntity;

	}
//	/* Set Answer YES/NO */

	public HsDefaultJobFilterQaOptionMaster filterQuestionOptionValue(Filter filter)  {

		FilterYesOrNo filteryesNo = new FilterYesOrNo();
		filteryesNo = filter.getFilterYesOrNo();
		HsDefaultJobFilterQaOptionMaster hsDefaultJobFilterQaOptionMaster = new HsDefaultJobFilterQaOptionMaster();
		hsDefaultJobFilterQaOptionMaster.setOptionValue(filteryesNo.getAnswer());
		hsDefaultJobFilterQaOptionMaster.setStatus(JobUtility.JOBSTATUS_DRAFT_ID);
		return hsDefaultJobFilterQaOptionMaster;

	}

//	/* retrieve FreeForm Question */

	public HsdefaultJobFilterQaMaster filterFreeFormQuestiondtoToEntity(Filter filter) {
		HsdefaultJobFilterQaMaster hsdefaultJobFilterQaMasterEntity = new HsdefaultJobFilterQaMaster();

		FilterFreeForm freeFormQuestion = new FilterFreeForm();
		freeFormQuestion = filter.getFilterFreeForm();
		hsdefaultJobFilterQaMasterEntity.setQaTitle(freeFormQuestion.getQuestions());
		hsdefaultJobFilterQaMasterEntity.setStatus(JobUtility.JOBSTATUS_DRAFT_ID);
		return hsdefaultJobFilterQaMasterEntity;

	}

	/* freeJobBoard */

	public HsJobMaster getFreeJobBoard(JobBoard jobBoard) throws JobServiceException {

		HsJobMaster hsJobMasterEntity = new HsJobMaster();
		HsCraigslist hsCraigslist = new HsCraigslist();

		if (!ObjectUtils.isEmpty(jobBoard.isFreeJobboardChecked()) && jobBoard.isFreeJobboardChecked()) {

			hsJobMasterEntity.setFreeJobboard(true);
			hsJobMasterEntity.setFreeJobBoardPostDate(new Date());
			hsJobMasterEntity.setCreatedDate(new Date());
			hsJobMasterEntity.setCraigAmount(hsCraigslist.getPrice());
			hsJobMasterEntity.setStatus(JobUtility.JOBSTATUS_DRAFT_ID);

		}

		return hsJobMasterEntity;
	}

}