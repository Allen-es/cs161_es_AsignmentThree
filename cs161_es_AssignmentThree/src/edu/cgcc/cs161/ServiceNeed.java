package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class describes the needed service for a client.
public class ServiceNeed {
	//Fields
	private String ServiceNeedDiscription;
	//Constructor
	ServiceNeed(){
	ServiceNeedDiscription="Some Discription";
	}
	private String getServicNeedDiscripption() {
		return ServiceNeedDiscription;
	}
	private void setServiceNeedDiscription(String SND) {
		ServiceNeedDiscription=SND;	
}

	public void IdentifyNeed() {
		}
	public void MakeAppointment() {
	}
	public void MakeReferal() {
		
	}
}