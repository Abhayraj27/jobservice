package com.job.utility;

public class JobUtility {

	public static final Integer ACTIVE_STATUS = 1;
	public static final String ACTIVE_STATUS_NAME = "Active";
	public static final String JOBTYPE_FULLTIME = "Full Time";
	public static final Integer JOBTYPE_FULLTIME_ID = 1;
	public static final String JOBTYPE_PARTTIME = "Part Time";
	public static final Integer JOBTYPE_PARTTIME_ID = 2;
	public static final String JOBTYPE_CONTRACT = "Contract";
	public static final Integer JOBTYPE_CONTRACT_ID = 3;
	public static final String JOBSALARY_ANNUAL = "Annually";
	public static final Integer JOBSALARY_ANNUAL_ID = 1;
	public static final String JOBSALARY_MONTH = "Monthly";
	public static final Integer JOBSALARY_MONTH_ID = 2;
	public static final String JOBSALARY_HOUR = "Hourly";
	public static final Integer JOBSALARY_HOUR_ID = 3;
	public static final String JOBSALARY_DOE = "DOE";
	public static final Integer JOBSALARY_DOE_ID = 4;
	public static final String JOBFILTER_YES_OPTION = "YES";
	public static final String JOBFILTER_NO_OPTION = "NO";

//Match Filter

	public enum MatchEnum {

		FULLMATCH("FULL MATCH", 1), PARTIALMATCH("PARTIAL MATCH", 2);

		private String matchName;
		private Integer matchId;

		private MatchEnum(String matchName, Integer matchId) {
			this.matchName = matchName;
			this.matchId = matchId;
		}

		public String getMatchName() {
			return matchName;
		}

		public Integer getMatchId() {
			return matchId;
		}

	}

	// Job board garble created by md5 encoding name and truncating to 5 characters

	public static final String JOBBOARD_MONSTER_NAME = "Monster";
	public static final String JOBBOARD_MONSTER_NAME_GARBLE = "F6B25";
	public static final Long JOBBOARD_MONSTER_ID = 1l;
	public static final String JOBBOARD_JUJU_NAME = "Juju";
	public static final String JOBBOARD_JUJU_NAME_GARBLE = "AF70E";
	public static final Long JOBBOARD_JUJU_ID = 2l;
	public static final String JOBBOARD_SIMPLYHIRED_NAME = "SimplyHired";
	public static final String JOBBOARD_SIMPLYHIRED_NAME_GARBLE = "1F99E";
	public static final Long JOBBOARD_SIMPLYHIRED_ID = 3l;
	public static final String JOBBOARD_OODLE_NAME = "Oodle";
	public static final String JOBBOARD_OODLE_NAME_GARBLE = "66F15";
	public static final Long JOBBOARD_OODLE_ID = 4l;
	public static final String JOBBOARD_GLASSDOOR_NAME = "Glassdoor.com";
	public static final String JOBBOARD_GLASSDOOR_NAME_GARBLE = "64CD0";
	public static final Long JOBBOARD_GLASSDOOR_ID = 5l;
	public static final String JOBBOARD_INDEED_NAME = "Indeed";
	public static final String JOBBOARD_INDEED_NAME_GARBLE = "6E846";
	public static final Long JOBBOARD_INDEED_ID = 6l;
	public static final String JOBBOARD_CRAIGSLIST_NAME = "Craigslist";
	public static final String JOBBOARD_CRAIGSLIST_NAME_GARBLE = "5A377";
	public static final Long JOBBOARD_CRAIGSLIST_ID = 7l;
	public static final String JOBBOARD_DICE_NAME = "Dice";
	public static final String JOBBOARD_DICE_NAME_GARBLE = "8A1BE";
	public static final Long JOBBOARD_DICE_ID = 8l;
	public static final String JOBBOARD_OLX_NAME = "OLX";
	public static final String JOBBOARD_OLX_NAME_GARBLE = "D1F43";
	public static final Long JOBBOARD_OLX_ID = 9l;
	public static final String JOBBOARD_EBAYCLASSIFIED_NAME = "e-Bay Classified";
	public static final String JOBBOARD_EBAYCLASSIFIED_NAME_GARBLE = "746B0";
	public static final Long JOBBOARD_EBAYCLASSIFIED_ID = 10l;
	public static final String JOBBOARD_INDEED_SPONSORED_NAME = "Indeed Sponsored";
	public static final String JOBBOARD_INDEED_SPONSORED_NAME_GARBLE = "B77DB";
	public static final Long JOBBOARD_INDEED_SPONSORED_ID = 12l;
	public static final String JOBBOARD_MONSTER_FREE_NAME = "Monster Free";
	public static final String JOBBOARD_MONSTER_FREE_NAME_GARBLE = "BA371";
	public static final Long JOBBOARD_MONSTER_FREE_ID = 13l;
	public static final String JOBBOARD_SIMPLYHIRED_SPONSORED_NAME = "SimplyHired Premium";
	public static final String JOBBOARD_SIMPLYHIRED_SPONSORED_NAME_GARBLE = "5832A";
	public static final Long JOBBOARD_SIMPLYHIRED_SPONSORED_ID = 14l;
	public static final String JOBBOARD_GENERIC_A_NAME = "Generic A";
	public static final String JOBBOARD_GENERIC_A_NAME_GARBLE = "3A15E";
	public static final Long JOBBOARD_GENERIC_A_ID = 11l;
	public static final String JOBBOARD_GENERIC_B_NAME = "Generic B";
	public static final String JOBBOARD_GENERIC_B_NAME_GARBLE = "042B2";
	public static final Long JOBBOARD_GENERIC_B_ID = 15l;
	public static final String JOBBOARD_GENERIC_C_NAME = "Generic C";
	public static final String JOBBOARD_GENERIC_C_NAME_GARBLE = "23F23";
	public static final Long JOBBOARD_GENERIC_C_ID = 16l;
	public static final String JOBBOARD_GENERIC_D_NAME = "Generic D";
	public static final String JOBBOARD_GENERIC_D_NAME_GARBLE = "10b59";
	public static final Long JOBBOARD_GENERIC_D_ID = 17l;
	public static final String JOBBOARD_GENERIC_E_NAME = "Generic E";
	public static final String JOBBOARD_GENERIC_E_NAME_GARBLE = "c957b";
	public static final Long JOBBOARD_GENERIC_E_ID = 18l;
	public static final String JOBBOARD_TOP_USA_JOBS_NAME = "TopUSAjobs";
	public static final String JOBBOARD_TOP_USA_JOBS_NAME_GARBLE = "A0091";
	public static final Long JOBBOARD_TOP_USA_JOBS_ID = 19l;
	public static final String JOBBOARD_TOP_USA_JOBS_SPONSORED_NAME = "TopUSAjobs Sponsored";
	public static final String JOBBOARD_TOP_USA_JOBS_SPONSORED_NAME_GARBLE = "516BC";
	public static final Long JOBBOARD_TOP_USA_JOBS_SPONSORED_ID = 24l;
	public static final String JOBBOARD_TROVIT_NAME = "Trovit";
	public static final String JOBBOARD_TROVIT_NAME_GARBLE = "053CB";
	public static final Long JOBBOARD_TROVIT_ID = 20l;
	public static final String JOBBOARD_YAKAZ_NAME = "Yakaz";
	public static final String JOBBOARD_YAKAZ_NAME_GARBLE = "AA50D";
	public static final Long JOBBOARD_YAKAZ_ID = 21l;
	public static final String JOBBOARD_JOB_INVENTORY_NAME = "JobInventory";
	public static final String JOBBOARD_JOB_INVENTORY_NAME_GARBLE = "D53D9";
	public static final Long JOBBOARD_LINKED_IN_ID = 16l;
	public static final String JOBBOARD_LINKED_IN_NAME = "Linkedin";
	public static final Long JOBBOARD_ZIP_RECRUITER_ID = 16l;
	public static final String JOBBOARD_ZIP_RECRUITER_NAME = "Ziprecruiter";

	public static String RoundTo2Decimals(double val) {
		return null;
	}



	// Transaction
	public static final String TRANSACTION_PROCESS_TYPE_NAME_DEBIT = "Debit";
	public static final Integer TRANSACTION_PROCESS_TYPE_NAME_DEBIT_ID = 1;
	public static final String TRANSACTION_PROCESS_TYPE_NAME_CREDIT = "Credit";
	public static final Integer TRANSACTION_PROCESS_TYPE_NAME_CREDIT_ID = 2;

	public static final String TRANSACTION_STATUS_PENDING_APPROVAL_NAME = "Pending approval";
	public static final Integer TRANSACTION_STATUS_PENDING_APPROVAL_ID = 1;
	public static final String TRANSACTION_STATUS_APPROVED_NAME = "Approved";
	public static final Integer TRANSACTION_STATUS_APPROVED_ID = 2;
	public static final String TRANSACTION_STATUS_ERROR_NAME = "Error";
	public static final Integer TRANSACTION_STATUS_ERROR_ID = 3;
	public static final String TRANSACTION_STATUS_PROCESSING_NAME = "Processing";
	public static final Integer TRANSACTION_STATUS_PROCESSING_ID = 4;
	public static final String TRANSACTION_STATUS_COMPLETED_NAME = "Completed";
	public static final Integer TRANSACTION_STATUS_COMPLETED_ID = 5;
	public static final String TRANSACTION_STATUS_DECLINED_NAME = "Declined";
	public static final Integer TRANSACTION_STATUS_DECLINED_ID = 7;
	public static final String TRANSACTION_STATUS_SUCCESS_NAME = "Success";
	public static final Integer TRANSACTION_STATUS_SUCCESS_ID = 6;
	public static final String TRANSACTION_STATUS_NONE_NAME = "None";
	public static final Integer TRANSACTION_STATUS_NONE_ID = 8;

	// Credit Card types
	public static final String CARD_TYPE_NONE = "None";
	public static final Integer CARD_TYPE_NONE_ID = 0;
	public static final String VISA_NAME = "Visa";
	public static final Integer VISA_NAME_ID = 1;
	public static final String MC_NAME = "Master Card";
	public static final Integer MC_NAME_ID = 2;
	public static final String DISCOVER_NAME = "Discover";
	public static final Integer DISCOVER_NAME_ID = 3;
	public static final String AMEX_NAME = "American Express";
	public static final Integer AMEX_NAME_ID = 4;

	public static final String CREDIT_CARD_TRANSACTION_TYPE_AUTHORIZATION_ONLY = "AuthorizationOnly";

	// Account
	public static final String ACCOUNT_BATCH_STATUS_PENDING_APPROVAL_NAME = "Pending approval";
	public static final Long ACCOUNT_BATCH_STATUS_PENDING_APPROVAL_ID = 1L;
	public static final String ACCOUNT_BATCH_STATUS_APPROVED_NAME = "Approved";
	public static final Long ACCOUNT_BATCH_STATUS_APPROVED_ID = 2L;
	public static final String ACCOUNT_BATCH_STATUS_ERROR_NAME = "Error";
	public static final Long ACCOUNT_BATCH_STATUS_ERROR_ID = 3L;
	public static final String ACCOUNT_BATCH_STATUS_PROCESSING_NAME = "Processing";
	public static final Long ACCOUNT_BATCH_STATUS_PROCESSING_ID = 4L;
	public static final String ACCOUNT_BATCH_STATUS_COMPLETED_NAME = "Completed";
	public static final Long ACCOUNT_BATCH_STATUS_COMPLETED_ID = 5L;

	public static final String ACCOUNT_TRANSACTION_STATUS_PENDING_APPROVAL_NAME = "Pending approval";
	public static final Long ACCOUNT_TRANSACTION_STATUS_PENDING_APPROVAL_ID = 1L;
	public static final String ACCOUNT_TRANSACTION_STATUS_APPROVED_NAME = "Approved";
	public static final Long ACCOUNT_TRANSACTION_STATUS_APPROVED_ID = 2L;
	public static final String ACCOUNT_TRANSACTION_STATUS_ERROR_NAME = "Error";
	public static final Long ACCOUNT_TRANSACTION_STATUS_ERROR_ID = 3L;
	public static final String ACCOUNT_TRANSACTION_STATUS_PROCESSING_NAME = "Processing";
	public static final Long ACCOUNT_TRANSACTION_STATUS_PROCESSING_ID = 4L;
	public static final String ACCOUNT_TRANSACTION_STATUS_COMPLETED_NAME = "Completed";
	public static final Long ACCOUNT_TRANSACTION_STATUS_COMPLETED_ID = 5L;
	
	
	//DRAFT Status
	
	
	public static final String JOBSTATUS_DRAFT = "Draft";
	public static final Integer JOBSTATUS_DRAFT_ID = 1;
	public static final String JOBSTATUS_OPEN = "Expired";
	public static final Integer JOBSTATUS_OPEN_ID = 2;
	public static final String JOBSTATUS_CLOSED = "Closed";
	public static final Integer JOBSTATUS_CLOSED_ID = 3;
	
	

}
