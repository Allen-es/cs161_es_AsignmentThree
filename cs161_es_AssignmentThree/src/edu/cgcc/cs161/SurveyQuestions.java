package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class holds the questions.
public class SurveyQuestions extends Survey {
//Fields	
	private int QuestionNumber;
	private String Question;
	
	//Constructor
SurveyQuestions(){
	QuestionNumber=5;
	Question="Some question";
}

	public int getQuestionNumber() {
		return QuestionNumber;
		}
	public String getQuestion() {
		return Question;
	}
	public void setQuestionNumber(int qn) {
		QuestionNumber=qn;
	}
	public void setQuestion(String Q) {
		Question=Q;
	}
}
