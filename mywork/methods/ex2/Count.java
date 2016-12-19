package mywork.methods.ex2;

/**
 * 
 * @author William Kratz
 * Class which contains static methods that determing the number of characters of
 * certain types held in a String or StringBuffer.
 *
 */

public class Count {
	static int digitCount = 0;
	static int whitespaceCount = 0;
	static String temp;
	
	//method returns the number of digits in a String
	//excludes whitespace
	public static int digits(String text) {
		resetCounts();
		sepWhiteSpace(text);
		return digitCount;
	}
	
	//method returns the total amount of whitespace in a String
	public static int whitespace(String text) {
		resetCounts();
		sepWhiteSpace(text);
		return whitespaceCount;
	}
	
	//method returns the number of digits in a StringBuffer
	//excludes whitespace
	public static int digits(StringBuffer text) {
		resetCounts();
		temp = text.toString();
		sepWhiteSpace(temp);
		return digitCount;
		
	}
	
	//method returns the total amount of whitespace in a StringBuffer
	public static int whitespace(StringBuffer text) {
		resetCounts();
		temp = text.toString();
		sepWhiteSpace(temp);
		return whitespaceCount;
	}
	
	//method loops through the String text keeping count
	//of whitespace and digits
	private static void sepWhiteSpace(String text){
		for(int i=0; i<text.length(); i++){
			if (text.charAt(i) == ' '){
				whitespaceCount ++;
			} else {
				digitCount++;
			}
		}
	}
	
	//method resets the counts
	private static void resetCounts() {
		digitCount = 0;
		whitespaceCount = 0;
	}

}
