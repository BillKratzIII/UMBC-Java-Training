package mywork.methods.ex2;

/**
 * 
 * @author William Kratz
 * Program that when run will use methods defined
 * in the Count class on Strings or StringBuffers
 *
 */

public class CountTest {
	public static void main(String[] args) {
		//String object to test methods in Count class that take a String parameter
		String testSubject = "Test Subject 1";
		//StringBuffer object to test methods in Count class that take a StringBuffer parameter
		StringBuffer sb = new StringBuffer("Test Subject 2 !");
		
		//Test Coutn methods on String object
		System.out.println("Total Length: " + testSubject.length());
		System.out.println("Digits: " + Count.digits(testSubject));
		System.out.println("Whitespace: " + Count.whitespace(testSubject));
		System.out.println();
		
		//Test Count class methods on StringBuffer object
		System.out.println("Total Length: " + sb.length());
		System.out.println("Digits: " + Count.digits(sb));
		System.out.println("Whitespace: " + Count.whitespace(sb));
		
	}
	
	
	
}
