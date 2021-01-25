package edu.cgcc.cs161;
//HEADER
//Program Name: Week 3 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/24/2021
//Description: This class is the main base class used to call and relate to the other classes. 
public class AssignmentThree {

	public static void main(String[] args) {
		
		Client c=new Client();
		System.out.println(c.getFirstName());
		c.setFirstName ("Ethan Sexton");
		System.out.println(c.getFirstName());
	}

}
