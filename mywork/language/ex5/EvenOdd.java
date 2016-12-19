package mywork.language.ex5;

/**
 * 
 * @author William Kratz
 * Program to decribe if an integer between -4 and 4 is +/- and even/odd when run
 *
 */

public class EvenOdd {
	public static void main(String[] args) {
		for (int i=-4; i <=4; i++){
			if(isZero(i)){
				System.out.println(i + " is even");
			} else if(isNegative(i)){
				System.out.print(i + " is negative and ");
				if (isOdd(i)){
					System.out.println("odd");
				} else {
					System.out.println("even");
				}
			} else {
				System.out.print(i + " is positive and ");
				if (isOdd(i)){
					System.out.println("odd");
				} else {
					System.out.println("even");
				}
			}
		}
		
	}
	
	public static boolean isZero(int num){
		boolean isZero = false;
		
		if (num == 0){
			isZero = true;
		}
		
		return isZero;
	}
	
	public static boolean isNegative(int num){
		boolean isNegative = false;
		
		if (num < 0) {
			isNegative = true;
		}
		
		return isNegative;
	}
	
	public static boolean isOdd(int num){
		boolean isOdd = false;
		
		if (num%2!=0){
			isOdd = true;
		}
		
		return isOdd;
	}

}
