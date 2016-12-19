package mywork.arrays.ex3;

/**
 * 
 * @author William Kratz
 * Class used to test methods in the Assets class.
 *
 */

public class TestAssets {

	public static void main(String[] args) {
		//ASSET ELEMENT a
		Assets a = new Assets(3);
		
		a.addElement("television", 400.50);
		a.addElement("computer", 2200);
		a.addElement("vehicle", 36495.95);
		System.out.println(a.toString());
		System.out.println("Items currently stored: \t" + a.size());
		System.out.println("Total capacity is: \t" + a.capacity());
		System.out.println("Total Value:\t $" + a.getTotalValue());
		System.out.println("First item is: \t" + a.getItem(0));
		System.out.println();
		
		//ASSET ELEMENT things
		Assets things = new Assets(10);
        things.addElement("Car", 25000.00);
        things.addElement("Boat", 50000.00);
        things.addElement("Stereo", 1000.00);
        System.out.println("ITEMS ARE:\n" + things);
        System.out.println("WORTH IS:  " + things.getTotalValue());
        System.out.println(things.getItem(1));
        System.out.println(things.getItem(4));
        System.out.println(things.getItem(2));

        System.out.println("SIZE: " + things.size());
        System.out.println("CAPACITY: " + things.capacity());

	}
	
	

}
