package com.job.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.job.exception.JobServiceException;
import com.job.request.model.Filter;
import com.job.request.model.JobBoard;
import com.job.request.model.JobDescription;
import com.job.service.JobService;

@RestController
@RequestMapping(value = "/job")
public class JobController {

	private static final Logger LOGGER = LoggerFactory.getLogger(JobController.class);

	@Autowired
	JobService jobService;

	@PostMapping("/jobDescription")
	public ResponseEntity<?> createJob(@RequestBody JobDescription jobDescription)  throws JobServiceException
			 {

		LOGGER.info("-------Job Service - job description api started-------");

		LOGGER.info("Received Job Description Request : {}", jobDescription.toString());

		//HsJobMaster hsJobMaster = jobService.createJobDescription(jobDescription);
		LOGGER.info("+++++++++++ Job Service - job description api ended ++++++++");
      return new ResponseEntity<>(jobService.createJobDescription(jobDescription), HttpStatus.OK);
      
      
	}

	@PostMapping("/filterQuestions")
	public void jobFilter(@RequestBody Filter filter) throws JobServiceException {

		LOGGER.info("-------Job Service - job filter api started-------");

		LOGGER.info("Received Job filter Request : {}", filter.toString());

		jobService.filterQuestionType(filter);
		
		jobService.filterByKeyword(filter);

		LOGGER.info("+++++++++++ Job Service - job filter api ended ++++++++");

		return;

	}
	

	@PostMapping("/jobBoard")
	public void getjobBoard(@RequestBody JobBoard jobBoard) throws JobServiceException{
		
		LOGGER.info("-------Job Service - job  board api started-------");

		LOGGER.info("Received Job board Request : {}", jobBoard.toString());
		
		jobService.setFreeJobBoard(jobBoard);
		
		//jobService.getPaymentByJobBoardId(jobBoard);
		// jobService.getDiscountByCoupon(jobDescription);
		
		LOGGER.info("+++++++++++ Job Service - job board api ended ++++++++");
		
		return;

	}

//	@PostMapping("/postJob")
//	public void postJob(@RequestBody JobDescription jobDescription) throws Exception {
//
//		jobService.isPaymentSuccess(jobDescription);
//
//	}

}