package mywork.ooprogramming.ex4;

/**
 * 
 * @author William Kratz
 * Program that when run creates several SimpleDate objects
 * to test methods in the SimpleDate class.
 *
 */

public class SimpleDateTest {

	public static void main(String[] args) {
		
		//SIMPLEDATE OBJECT sd1
		System.out.println("Manually set entire date:");
		SimpleDate sd1 = new SimpleDate(2,29,2004);
		System.out.println(sd1.toString());
		sd1.setDay(11);
		sd1.setMonth(4);
		sd1.setYear(1986);
		System.out.println(sd1.toString());
		System.out.println();
		
		//SIMPLEDATE OBJECT sd2
		System.out.println("Manually set month & day, get current year:");
		SimpleDate sd2 = new SimpleDate(10,31);
		System.out.println(sd2.toString());
		System.out.println();
		
		//SIMPLEDATE OBJECT sd3
		System.out.println("Manually set day, get current month & year:");
		SimpleDate sd3 = new SimpleDate(15);
		System.out.println(sd3.toString());
		System.out.println();
		
		//SIMPLEDATE OBJECT sd4
		System.out.println("Get current month, day & year:");
		SimpleDate sd4 = new SimpleDate();
		System.out.println("SimpleDate: " + sd4.getMonth() + "/" + sd4.getDay() + "/" + sd4.getYear());
		System.out.println();
		
		//SIMPLEDATE OBJECT sd5
		System.out.println("Manually set month, day & year by entering a formatted String");
		SimpleDate sd5 = new SimpleDate("7/16/2015");
		System.out.println(sd5.toString());
		System.out.println("Year: " + sd5.getYear());
		System.out.println();
		
		//ARRAY OF SIMPLE DATE OBJECTS TO TEST ENCAPSULATION METHODS
		SimpleDate dates [] = {
			    new SimpleDate(2, 3, 2008),   //DayOfYear:34   DaysLeft:332
			    new SimpleDate(2, 3, 2011),   //DayOfYear:34   DaysLeft:331
			    new SimpleDate(3, 2, 2008),   //DayOfYear:62   DaysLeft:304
			    new SimpleDate(3, 2, 2011),   //DayOfYear:61   DaysLeft:304
			    new SimpleDate(12, 30, 2008), //DayOfYear:365  DaysLeft:1
			    new SimpleDate(12, 30, 2011), //DayOfYear:364  DaysLeft:1
	        };
	        for(int i = 0; i < dates.length; i++){
	            System.out.println(dates[i]);
	            System.out.println("Month:     " + dates[i].getMonthAsString());
	            System.out.println("DayOfYear: " + dates[i].getDayOfYear());
	            System.out.println("DaysLeft:  " + dates[i].getDaysLeftInYear());
	            SimpleDateValidation validator = new SimpleDateValidation(dates[i].getDay(), dates[i].getMonth(), dates[i].getYear());
	            System.out.println("Leap Year: " + validator.isLeapYear());
	            System.out.println();
	        }

	}

}
