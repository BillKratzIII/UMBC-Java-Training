package mywork.inheritance.ex1;

import mywork.ooprogramming.ex4.SimpleDate;

/**
 * 
 * @author William Kratz
 * Class has all proerties of the SimpleDate Class
 * and also stores a place for the appointment and 
 * person the appointment is with.
 *
 */

public class Appointment extends SimpleDate {
	//Instance Variables
	String place;
	String personWith;

	//Constructor
	public Appointment(int month, int day, int year, String place, String personWith) {
		super(month, day, year);
		this.place = place;
		this.personWith = personWith;
	}

	//Getters and Setters
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPersonWith() {
		return personWith;
	}

	public void setPersonWith(String personWith) {
		this.personWith = personWith;
	}

	//Method returns a formatted String of all instance variables
	@Override
	public String toString() {
		return super.toString() + " - Appointment with " + personWith + " at " + place;
	}
	
	


}
