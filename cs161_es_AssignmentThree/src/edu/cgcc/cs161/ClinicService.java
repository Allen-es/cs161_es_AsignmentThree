package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class holds the information to the clinic.
public class ClinicService {

	//Fields
	private int ServiceNumber;
	private String ServiceName;
	private String ServiceDescription;
	
	//Constructor
	ClinicService(){
		ServiceNumber=12;
		ServiceName="Service Name";
		ServiceDescription="Service discription";
	}
	public int getServiceNumber() {
		return ServiceNumber;
	}
	public String getServiceName() {
		return ServiceName;
	}
	public String getServiceDescription() {
		return ServiceDescription;
	}
	public void setServiceNumber(int SNum) {
		ServiceNumber=SNum;
	}
	public void setServiceName(String SNam) {
		ServiceName=SNam;
	}
	public void setServiceDescription(String SDes) {
		ServiceDescription=SDes;
	}
}
