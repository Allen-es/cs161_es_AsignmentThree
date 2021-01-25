package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class reveals the information in an appointment. 

public class Appointment extends Calendar {
	//Fields
	private int Date;
	private int Time;
	
	//Constructor
	Appointment(){
		Date=1-24-21;
		Time=13_59;
	}
	public int getDate() {
		return Date;
	}
	public int getTime() {
		return Time;
	}
	public void setDate(int D) {
		Date=D;
	}
	public void setTime(int T) {
		Time=T;
	}
}
