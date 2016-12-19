package mywork.ooprogramming.ex4;

/**
 * 
 * @author William Kratz Validation methods used by SimpleDate Class
 * 
 */

public class SimpleDateValidation {
	int month;
	int day;
	int year;

	//constructor
	public SimpleDateValidation(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// Method returns true if the day, month AND year pass validation,
	// otherwise it returns false
	boolean isValidSD() {
		boolean isValidDate = false;

		if (isValidDay()) {
			if (isValidMonth()) {
				if (isValidYear()) {
					isValidDate = true;
				}
			}
		}

		return isValidDate;
	}

	// Method returns true only if day is between 1 and 31 inclusive
	boolean isValidDay() {
		boolean isValidDay = false;

		if (isFebruary()) {
			isValidDay = evalFeb();
		} else if (monthHas31Days()) {
			isValidDay = testDay(31);
		} else {
			isValidDay = testDay(30);
		}

		return isValidDay;
	}

	//Check for a valid day in February based on 
	//whether or not it is a leap year
	private boolean evalFeb() {
		boolean isValidDay;
		if (isLeapYear()) {
			isValidDay = testDay(29);
		} else {
			isValidDay = testDay(28);
		}
		return isValidDay;
	}

	// method returns true if the year is a leap year
	boolean isLeapYear() {
		boolean isLeapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				isLeapYear = false;
			} else {
				isLeapYear = true;
				System.out.print(" (leap year) ");
			}
		}

		return isLeapYear;
	}

	// Method returns true if the month matches a int in the monthsWith31Days
	// Array
	private boolean monthHas31Days() {
		int[] monthsWith31Days = { 1, 3, 5, 7, 8, 10, 12 };
		boolean monthHas31Days = false;

		for (int i = 0; i < monthsWith31Days.length; i++) {
			if (month == monthsWith31Days[i]) {
				monthHas31Days = true;
			}
		}

		return monthHas31Days;
	}

	// method tests if the day is valid for the given month
	private boolean testDay(int maxDays) {
		boolean isValidDay = false;

		if (day > 0 && day <= maxDays) {
			isValidDay = true;
		} else {
			System.out.println("Invalid Day");
		}

		return isValidDay;
	}

	// Method returns true if the month is 2
	private boolean isFebruary() {
		boolean isFebruary = false;

		if (month == 2) {
			isFebruary = true;
		}

		return isFebruary;
	}

	// Method returns true only if month is between 1 and 12 inclusive
	boolean isValidMonth() {
		boolean isValidMonth = false;

		if (month > 0 && month <= 12) {
			isValidMonth = true;
		} else {
			System.out.println("Invalid Month");
		}

		return isValidMonth;
	}

	// Method returns true only if year is greater than 0
	private boolean isValidYear() {
		boolean isValidYear = false;

		if (year > 0) {
			isValidYear = true;
		} else {
			System.out.println("Invalid Year");
		}

		return isValidYear;
	}
}
