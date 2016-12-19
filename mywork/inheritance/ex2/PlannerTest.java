package mywork.inheritance.ex2;

import mywork.inheritance.ex1.Appointment;
import mywork.inheritance.ex1.Holiday;
import mywork.ooprogramming.ex4.SimpleDate;

/**
 * 
 * @author William Kratz
 * Program that when run creates a Planner object 
 * to test methods in Planner class.
 *
 */

public class PlannerTest {

	public static void main(String[] args) {
		
		//PLANNER OBJECT pl
		Planner pl = new Planner(10);
		
		//Add Dates
		pl.addDate(new Appointment(12,22,16, "11:00am", "Doctor"));
		pl.addDate(new Holiday(12, 25, 2016, "Christmas"));
		pl.addDate(new SimpleDate());
		pl.addDate(new Holiday(4,11,1986, "My Birth Day"));
		pl.addDate(new SimpleDate(12,16,2016));
		pl.addDate(new Holiday(7,16,15, "Liam's Birth Day"));
		pl.addDate(new Appointment(12,17,16, "8:30am", "Earl"));
		
		//Display all holidays
		Holiday[] test = pl.getHolidays();
		for (int i=0; i<test.length; i++){
			System.out.println(test[i].toString());
		}
		System.out.println();
		
		//Display all appointments
		Appointment[] appts = pl.getAppointments();
		for (int i=0; i<appts.length; i++){
			System.out.println(appts[i].toString());
		}
		System.out.println();
		
		//Display all dates
		System.out.println(pl.toString());

	}

}
