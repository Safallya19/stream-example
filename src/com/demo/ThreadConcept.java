package com.demo;

interface Vehicle {
	   default void print() {
	      System.out.println("I am a vehicle!");
	   }
	} 

public class ThreadConcept implements Vehicle{
	
	
	  public void get() { System.out.println("Inside class");  Vehicle.super.print(); }
	 
	
	public static void main(String[] args) {
		
		ThreadConcept t = new ThreadConcept();
		t.print();

	}

}
