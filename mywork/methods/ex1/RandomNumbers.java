package mywork.methods.ex1;

/**
 * 
 * @author William Kratz
 * Program that when run will generate at least 10,000 numbers, keeping two counts:
 * -those that are greater than 0.5
 * -those that are less than or equal to 0.5
 * After 10,000 print the two counts
 * Then, continue to generate random numbers and update the two counts until
 * one of the two conditions is met:
 * -the two counts are equal
 * -1,000,000 numbers have been generated
 * After one of the above two conditions are met, print out the time it took 
 * to run the program in milliseconds and terminate the program using 
 * System.exit(i), where i is 1 if the counts are equal or 2 if 1,000,000 is reached 
 *
 */

public class RandomNumbers {

	public static void main(String[] args) {
		//create new QuitObject q to store 
		QuitObject q = new QuitObject(System.currentTimeMillis());
		
		//run first loop to generate 10,000 random numbers
		RandomNumberActions.loop(10000, q);
	}
	
	

}
