package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class provides information on a referral list.
public class ReferralList {
	//Fields
	private String ProviderName;
	private String Location;
	private int Phone;
	private String ServiceProvider;
	
	//Operations
	ReferralList(){
		
	ProviderName="Provider Name";
	Location="Some location";
	Phone=987-654-321;
	ServiceProvider="Some Service Provider";		
	}
	
	public String getProviderName() {
		return ProviderName;
	}
	public String getLocation() {
		return Location;
	}
	public int getPhone() {
		return Phone;
	}
	public String getServiceProvider() {
		return ServiceProvider;
	}
	public void setProviderName(String tpn) {
		ProviderName=tpn;
	}
	public void setLocation(String L) {
		Location=L;
	}
	public void setPhone(int tnum) {
		Phone=tnum;
	}
	public void setServiceProvider(String tsp) {
		ServiceProvider=tsp;
	}
	
	public void matchServicNeeds() {
		
	}
	public void displayMatchedList() {
		
	}
}
