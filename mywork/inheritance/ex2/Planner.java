package mywork.inheritance.ex2;

import mywork.inheritance.ex1.Appointment;
import mywork.inheritance.ex1.Holiday;
import mywork.ooprogramming.ex4.SimpleDate;

/**
 * 
 * @author William Kratz
 * Class to store Simple Dates, Holidays and Appointments.
 * Methods to sort objects.
 *
 */

public class Planner {
	//Instance variables
	private SimpleDate sd[];
	private int capacity;
	private int size;
	
	//Constructor
	public Planner (int capacity) {
		sd = new SimpleDate[capacity];
		this.capacity = capacity;
	}
	
	//Getters
	public int getCapacity() {
		return capacity;
	}
	
	public int getSize() {
		return size;
	}
	
	//Method to add a Date to the array sd
	public void addDate (SimpleDate d) {
		if (size<capacity) {
			sd[size++] = d;
		} else {
			System.out.println("ERROR: Planner is out of capacity");
		}
	}
	
	//Method returns a formatted String of all dates in Planner
	public String toString() {
		StringBuffer output = new StringBuffer("");
		
		for (int i = 0; i < size; i++) {
			output.append(sd[i].toString());
			output.append("\n");
		}
		
		return output.toString();
	}
	
	//Method returns an array of all Holidays in Planner
	public Holiday[] getHolidays() {
		Holiday [] holidays = new Holiday[getNumHolidays()];
		int count = 0;
		
		for (int i=0; i<sd.length; i++) {
			if(sd[i] instanceof Holiday) {
				holidays[count++] = (Holiday) sd[i];
			}
		}
		
		return holidays;
	}
	
	//Method returns the number of Holidays in the Planner
	public int getNumHolidays(){
		int numHolidays = 0;
		
		for (int i=0; i<sd.length; i++) {
			if(sd[i] instanceof Holiday) {
				numHolidays++;
			}
		}
		
		return numHolidays;
	}
	
	//Method returns the number of Appointments in the Planner
	public int getNumAppointments(){
		int numAppts = 0;
		
		for (int i=0; i<sd.length; i++) {
			if(sd[i] instanceof Appointment) {
				numAppts++;
			}
		}
		
		return numAppts;
	}
	
	//Method returns an array of all Appointments in the Planner
	public Appointment[] getAppointments() {
		Appointment [] appts = new Appointment[getNumAppointments()];
		int count = 0;
		
		for (int i=0; i<sd.length; i++) {
			if(sd[i] instanceof Appointment) {
				appts[count++] = (Appointment) sd[i];
			}
		}
		
		return appts;
	}

}
