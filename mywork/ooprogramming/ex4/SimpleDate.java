package mywork.ooprogramming.ex4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/**
 * 
 * @author William Kratz Class that represents a month, day and year.
 * 
 */

public class SimpleDate {
	int month;
	int day;
	int year;
	int currentYear;
	int currentMonth;
	int currentDay;
	private static String names[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	// Constructors

	// user supplies the month, day and year
	public SimpleDate(int month, int day, int year) {
		SimpleDateValidation validator = new SimpleDateValidation(month, day,
				year);

		if (validator.isValidSD()) {
			this.month = month;
			this.day = day;
			this.year = year;
		}
	}

	// user only supplies the month and day
	// constructor will determing current year
	public SimpleDate(int month, int day) {
		setCurrentDate();
		SimpleDateValidation validator = new SimpleDateValidation(month, day,
				currentYear);

		if (validator.isValidMonth() && validator.isValidDay()) {
			setSimpleDate();
			this.month = month;
			this.day = day;
		}
	}

	// user only supplies the day
	// constructor will determine current month & year
	public SimpleDate(int day) {
		setCurrentDate();
		SimpleDateValidation validator = new SimpleDateValidation(day,
				currentMonth, currentYear);

		if (validator.isValidDay()) {
			setSimpleDate();
			this.day = day;
		}
	}

	// user does not supply anything
	// contructor will determine current month, day & year
	public SimpleDate() {
		setSimpleDate();
	}
	
	//user supplies the full date as a string in the format m/d/yyy
	//constructor will seperate into month, day & year
	public SimpleDate(String date){
		//split string date into appropriate parts
		//store temporarily in current variables until they pass validation
		StringTokenizer st = new StringTokenizer(date, "/");
		this.currentMonth = Integer.parseInt(st.nextToken());
		this.currentDay = Integer.parseInt(st.nextToken());
		this.currentYear = Integer.parseInt(st.nextToken());
		
		//validate input from the user
		SimpleDateValidation validator = new SimpleDateValidation(currentMonth, currentDay,
				currentYear);
		
		//if valid, store permanently in mont, day, & year variables
		if (validator.isValidSD()) {
			this.month = currentMonth;
			this.day = currentDay;
			this.year = currentYear;
		}
	}
	
	//method returns the month as a String
	public String getMonthAsString() {
		return names[month-1];
	}
	
	//method returns the day of the year
	public int getDayOfYear() {
		Calendar cal = new GregorianCalendar(year, month-1, day);
		return cal.get(Calendar.DAY_OF_YEAR);
	}
	
	//method returns the number of days left in the year
	public int getDaysLeftInYear() {
		SimpleDateValidation validator = new SimpleDateValidation(month, day, year);
		if(validator.isLeapYear()){
			return calcDaysLeftInYear(366);
		} else {
			return calcDaysLeftInYear(365);
		}
	}
	
	//method returns nubmer of days left in year based on how many days are in a year
	//365 normally, 366 in leap years
	public int calcDaysLeftInYear(int numDaysInYear) {
		return numDaysInYear-getDayOfYear();
	}

	//set currentMonth and currentYear for validation purposes
	//before setting more permanently
	private void setCurrentDate() {
		CurrentDate today = new CurrentDate();
		this.currentDay = today.getCurrentDay();
		this.currentMonth = today.getCurrentMonth();
		this.currentYear = today.getCurrentYear();
	}

	// method to set month, day and year to current date
	private void setSimpleDate() {
		setCurrentDate();

		this.month = currentMonth;
		this.day = currentDay;
		this.year = currentYear;
	}

	// Getters and Setters
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Method returns formatted String of all variables in SimpleDate object
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

}
