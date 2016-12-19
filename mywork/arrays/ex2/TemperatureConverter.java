package mywork.arrays.ex2;

import java.text.DecimalFormat;

/**
 * 
 * @author William Kratz Program that when run will take three values from the
 *         command line: a beginning temp (celcius, and ending temp (celcius),
 *         and an increment value. The program produces a table of temperature
 *         conversions.
 * 
 */

public class TemperatureConverter {
	public static void main(String[] args) {
		// convert command line arguements from strings to doubles and store in
		// array
		double vals[] = { Double.valueOf(args[0]), Double.valueOf(args[1]),
				Double.valueOf(args[2]) };

		// display table of conversions
		printTable(vals);

	}

	// method prints out table of celcius and its fahrenheit conversions based
	// on a given interval
	private static void printTable(double[] vals) {
		// set formatting
		DecimalFormat df = new DecimalFormat("0.0");

		System.out.println("CELSIUS\tFAHRENHEIT");
		while (vals[0] <= vals[1]) {
			System.out.println(df.format(vals[0]) + "\u00b0\t"
					+ df.format(convert(vals[0])) + "\u00b0");
			vals[0] += vals[2];
		}
	}

	//method converts a celcisus parameter to fahrenheit and returns it as a double
	public static double convert(double celcius) {
		return 1.8 * celcius + 32;
	}
}
