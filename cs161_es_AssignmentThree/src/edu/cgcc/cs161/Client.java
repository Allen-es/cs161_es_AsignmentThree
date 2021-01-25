package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class holds the information to the client.
public class Client {
	
//Fields 
	private String FirstName;
	private String LastName;
	private String Street;
	private String City;
	private String  State;
	private String Country;
	private int ZipCode;
	private int Phone;
	private String Email;
	private String InsuranceCarrier;
	
//Constructor
	Client(){
		FirstName="Chris";
		LastName="Mullins";
		Street="Belmont";
		City="Hood River";
		State="Oregon";
		Country="America";
		ZipCode=12345;
		Phone=123-456-789;
		Email="chris@gmail.com";
		InsuranceCarrier="Something Insurance";
	}

	public String getFirstName() {
		return FirstName;
		}
	public String getLastName() {
		return LastName;
	}
	public String getStreet() {
		return Street;
	}
	public String getCity() {
		return City;
	}
	public String getState() {
		return State;
	}
	public String getCountry() {
		return Country;
	}
	public int getZipCode() {
		return ZipCode;
	}
	public int getPhone() {
		return Phone;
	}
	public String getEmail() {
		return Email;
	}
	public String getInsuranceCarrier() {
		return InsuranceCarrier;
	}
	
	public void setFirstName(String fn) {
		FirstName = fn;
	}
	public void setLastName(String ln) {
		LastName = ln;
	}
	public void setStreet(String srt) {
		Street=srt;
	}
	public void setCity(String ct) {
		City=ct;
	}
	public void setState(String st) {
		State=st;
	}
	public void setCountry(String c) {
		Country=c;
	}
	public void setZipCode(int zc) {
		ZipCode=zc;
	}
	public void setPhone(int ph) {
		Phone=ph;
	}
	public void setEmail(String e) {
		Email=e;
	}
	public void InsuranceCarrier(String ic) {
		InsuranceCarrier=ic;
	}
		}