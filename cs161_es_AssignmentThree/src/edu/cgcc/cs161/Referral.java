package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class holds the referral information and extends the referral list.
public class Referral extends ReferralList {

	private String ProviderName;
	private int Date;
	private int Time;

	Referral(){
		ProviderName="ProviderName";
		Date=1-23-21;
		Time=18_06;
	}
	public String getProviderName() {
		return ProviderName;
		}
	public int getDate() {
		return Date;
		}
	public int getTime() {
		return Time;
		}
	public void setProviderName(String PN) {
		ProviderName=PN;
	}
	public void setDate(int D) {
		Date=D;
	}
	public void setTime(int T) {
		Time=T;
	}
}