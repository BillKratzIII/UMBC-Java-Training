package mywork.ooprogramming.ex1;

/**
 * 
 * @author William Kratz
 * Program that when run will loop through a string object (input) 
 * and copy the characters into a StringBuffer object (output,) stripping all vowels in the process.
 *
 */

public class StripVowels {
	public static void main(String[] args) {
		String input = new String("Now is the AAA time");
		StringBuffer output = new StringBuffer();
		
		for(int i=0; i<input.length(); i++){
			if(notAVowel(input.charAt(i))){
				output.append(input.charAt(i));
			}
		}
		
		System.out.println(output);
	}
	
	//Method returns true if the char a is NOT a vowel, and false if char a is a vowel
	public static boolean notAVowel(char a){
		boolean notAVowel = true;
		char testSubject = Character.toLowerCase(a);
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		for(int i=0; i<vowels.length; i++){
			if(vowels[i]==testSubject){
				notAVowel = false;
			}
		}
		
		return notAVowel;
	}
}
