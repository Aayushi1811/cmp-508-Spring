package com.springcore.exam;

import java.util.List;


public class Question1 {
	private String question;
	private List<String> answer;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question1(String question, List<String> answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question1 [question=" + question + ", answer=" + answer + "]";
	}
	
	
}
