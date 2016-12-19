package mywork.ooprogramming.ex3;

/**
 * 
 * @author William Kratz
 * Program that when run creates several PaddedString objects and 
 * tests available methods.
 *
 */

public class PaddedStringTest {
	public static void main(String[] args) {
		
		//PADDEDSTRING OBJECT a
		String input = "   Testing 123   ";
		PaddedString a = new PaddedString(input);
		a.padLeft(20);
		a.trimBlanks();
		a.padRight(20);
		a.replace("New String");
		System.out.println("At the end the Padded String is '" + a.toString() + "' and has a size of " + a.length());
		System.out.println();
		
		
		//PADDEDSTRING OBJECT b
		double input2 = 123.456;
		PaddedString b = new PaddedString(input2);
		b.padLeft(10);
		b.trimBlanks();
		b.padRight(10);
		b.replace(987.654);
		System.out.println("At the end the Padded String is '" + b.toString() + "' and has a size of " + b.length());
		System.out.println();
		
		
		//PADDEDSTRING OBJECT c
		int input3 = 123456;
		PaddedString c = new PaddedString(input3);
		c.padLeft(10);
		c.trimBlanks();
		c.padRight(10);
		c.replace(987654);
		System.out.println("At the end the Padded String is '" + c.toString() + "' and has a size of " + c.length());
		System.out.println();
	}
}
