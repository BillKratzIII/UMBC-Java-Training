package mywork.arrays.ex1;

import java.util.Arrays;

/**
 * 
 * @author William Kratz Class encapsulates an array of String objects and
 *         defines several methods that can be performed on the data.
 * 
 */

public class StringOrganizer {
	// Instance variables
	String data[];
	String temp[];

	// Constructors
	public StringOrganizer(String[] args) {
		temp = new String[args.length];
		data = new String[args.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = args[i];
			data[i] = args[i];

		}
	}

	// method that stores a reverse of the command line arguments in
	// the data array
	public void reverse() {
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[(temp.length - 1) - i];
		}
		toTemp();
	}

	// method that sorts the command line arguments in an ascending order
	public void ascendingSort() {
		Arrays.sort(temp);
		toData();
	}

	// method that sorts the command line arguments in a descending order
	public void descendingSort() {
		ascendingSort();
		reverse();
	}

	// method that returns the String object in data
	// at the index specified
	public String getString(int index) {
		return data[index];
	}

	// method combines string values stored in data
	// to one String object and returns it
	public String toString() {
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			output.append(data[i]);
			output.append(' ');
		}
		return output.toString();
	}

	// method that prints to the console the action specfied and toString()
	public void printAfter(String action) {
		System.out.print("After " + action + ": ");
		System.out.println(toString());
	}

	// method to transfer data from temp array to data array
	public void toData() {
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

	// method to transfer date from data array to temp array
	// method to transfer data from temp array to data array
	public void toTemp() {
		for (int i = 0; i < temp.length; i++) {
			temp[i] = data[i];
		}
	}

}
