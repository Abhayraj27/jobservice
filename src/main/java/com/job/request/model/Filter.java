package com.job.request.model;

import java.io.Serializable;

public class Filter implements Serializable

{
    private static final long serialVersionUID = 6345470156047909238L;
    
	private Filterkeyword filterkeyword;
	private FilterYesOrNo filterYesOrNo;
	private FilterFreeForm filterFreeForm;
	
	
	
	public Filterkeyword getFilterkeyword() {
		return filterkeyword;
	}

	public void setFilterkeyword(Filterkeyword filterkeyword) {
		this.filterkeyword = filterkeyword;
	}

	public FilterYesOrNo getFilterYesOrNo() {
		return filterYesOrNo;
	}

	public void setFilterYesOrNo(FilterYesOrNo filterYesOrNo) {
		this.filterYesOrNo = filterYesOrNo;
	}

	public FilterFreeForm getFilterFreeForm() {
		return filterFreeForm;
	}

	public void setFilterFreeForm(FilterFreeForm filterFreeForm) {
		this.filterFreeForm = filterFreeForm;
	}

	public static class Filterkeyword {
		private String keyword;
		private Integer matchingCriteria;

		public String getKeyword() {
			return keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public Integer getMatchingCriteria() {
			return matchingCriteria;
		}

		public void setMatchingCriteria(Integer matchingCriteria) {
			this.matchingCriteria = matchingCriteria;
		}

	}

	public static class FilterYesOrNo {
		private String question;
		private String answer;

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

	}

	public static class FilterFreeForm {
		private String questions;

		public String getQuestions() {
			return questions;
		}

		public void setQuestions(String questions) {
			this.questions = questions;
		}

	}

}
	
	

