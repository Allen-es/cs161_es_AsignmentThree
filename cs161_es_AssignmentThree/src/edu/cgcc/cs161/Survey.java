package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class holds the contents of the survey.
public class Survey {
	//Fields
	private int SurveyNumber;
	private String QuestionSet;
	private String AnswerSet;
	//Constructor
	Survey(){
	SurveyNumber=1;
	QuestionSet="Some question set";
	AnswerSet="Some answer set";
	}
	public int getSurveyNumber() {
		return SurveyNumber;
	}
	public String QuestionSet() {
		return QuestionSet;
}
	public String AnswerSet() {
		return AnswerSet;
	}
	public void setSurveyNumber(int Sn) {
		SurveyNumber=Sn;
	}
	public void setQuestionSet(String Qs) {
		QuestionSet=Qs;
	}
	public void AnswerSet(String As) {
		AnswerSet=As;
	}
public void displayQuestion() {
	
}
public void recordAnswer() {
	
}}