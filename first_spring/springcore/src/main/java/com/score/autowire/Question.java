package com.score.autowire;

public class Question {
	
	private String Que1;
	private Answer answer;
	public String getQue1() {
		return Que1;
	}
	public void setQue1(String que1) {
		Que1 = que1;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String que1, Answer answer) {
		super();
		Que1 = que1;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [Que1=" + Que1 + ", answer=" + answer + "]";
	}

}
