package mywork.ooprogramming.ex4;

import java.util.Calendar;

/**
 * 
 * @author William Kratz
 * Class that stores methods to return details about the current date
 *
 */

public class CurrentDate {
	//create Calendar object cal that holds infomation about the current date
	Calendar cal = Calendar.getInstance();
	
	//method returns the current year
	public int getCurrentYear(){
		return cal.get(Calendar.YEAR);
	}
	
	//method returns the current month
	public int getCurrentMonth(){
		return cal.get(Calendar.MONTH) + 1;
	}
		
	//returns the current day
	public int getCurrentDay(){
		return cal.get(Calendar.DATE);
	}
	
}
