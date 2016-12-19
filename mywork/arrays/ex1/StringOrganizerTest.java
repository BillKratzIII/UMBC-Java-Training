package mywork.arrays.ex1;

/**
 * 
 * @author William Kratz
 * Program that when run creates a new StringOrganizer object
 * with data received from the command line and tests the methods
 * defined in the StringOrganizer class.
 *
 */

public class StringOrganizerTest {

	public static void main(String[] args) {
		StringOrganizer organizer = new StringOrganizer(args);
		
		//original arguements
		organizer.printAfter("original");
		
		//reverse order of arguements
		organizer.reverse();
		organizer.printAfter("reverse");
		
		//sort arguements in ascending order
		organizer.ascendingSort();
		organizer.printAfter("ascending sort");
		
		//sort arguements in descending order
		organizer.descendingSort();
		organizer.printAfter("descending sort");
		
		//another reverse
		organizer.reverse();
		organizer.printAfter("another reverse");
		
		//print String stored in index of 1
		System.out.println("At index of 1: " + organizer.getString(1));
		

	}

}
