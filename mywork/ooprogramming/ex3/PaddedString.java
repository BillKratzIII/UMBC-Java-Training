package mywork.ooprogramming.ex3;

/**
 * 
 * @author William Kratz
 * Class that will represent a new data type that can be padded with whitespace.
 *
 */

public class PaddedString {
	StringBuffer data;
	
	//Constructors
	public PaddedString(String input) {
		data = new StringBuffer(input);
	}
	
	public PaddedString(double input) {
		String castInput = String.valueOf(input);
		data = new StringBuffer(castInput);
	}
	
	public PaddedString(int input) {
		String castInput = String.valueOf(input);
		data = new StringBuffer(castInput);
	}
	
	//Method that removes leading and trailing whitespace
	public void trimBlanks(){
		int originalsize = data.length();
		String original = data.toString();
		
		for(int i=0; i<data.length(); i++){
			if(data.charAt(i) == ' '){
				data.deleteCharAt(i);
				i--;
			}
		}
		
		System.out.println("Original: '" + original + "' : " + "Size: " + originalsize);
		System.out.println("After trimBlanks(): '" + data + "' : " + "Size: " + data.length());
	}
	
	//Method adds whitespace to the left until the overall length is equal to the fieldWidth specified
	public void padLeft(int fieldWidth) {
		if(data.length() >= fieldWidth){
			System.out.println("ERROR: field width specefied is smaller that existing Padded String.");
		} else {
			while(data.length() != fieldWidth) {
				data.insert(0, ' ');
			}
		}
		
		System.out.println("After padLeft(): '" + data + "'");
	}
	
	//Method adds whitespace to the right until the overall length is equal to the fieldWidth specified
	public void padRight(int fieldWidth) {
		if(data.length() >= fieldWidth){
			System.out.println("ERROR: field width specefied is smaller that existing Padded String.");
		} else {
			while(data.length() != fieldWidth) {
				data.append(' ');
			}
		}
		
		System.out.println("After padRight: '" + data + "'");
	}
	
	//Method to replace value of data after construction with a String
	public void replace(String input) {
		data.replace(0, data.length(), input);
		System.out.println("After replace(): '" + data + "'");
	}
	
	//Method to replace value of data after construction with a double
	public void replace(double input) {
		String castInput = String.valueOf(input);
		data.replace(0, data.length(), castInput);
		System.out.println("After replace(): '" + data + "'");
	}
	
	//Method to replace value of data after construction with an int
	public void replace(int input) {
		String castInput = String.valueOf(input);
		data.replace(0, data.length(), castInput);
		System.out.println("After replace(): '" + data + "'");
	}
	
	//Method that returns the data object as a String
	public String toString() {
		return data.toString();
	}
	
	//Method returns the number of characters in the data object
	public int length() {
		return data.length();
	}

}
