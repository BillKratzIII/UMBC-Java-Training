package mywork.inheritance.ex1;

import mywork.ooprogramming.ex4.SimpleDate;

/**
 * 
 * @author William Kratz
 * Class has all proerties of the SimpleDate Class
 * and also stores a name of the holiday.
 *
 */

public class Holiday extends SimpleDate {
	//Instance variable
	String name;

	//Constructor
	public Holiday(int month, int day, int year, String name) {
		super(month, day, year);
		this.name = name;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Method returns a formatted String of all instance variables
	@Override
	public String toString() {
		return name + ": " + super.toString();
	}

}
