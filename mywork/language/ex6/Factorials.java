package mywork.language.ex6;

public class Factorials {
	public static void main(String[] args) {
		int originalNumber = 10;
		long factorial = factorial(originalNumber);
		
		
		System.out.println(originalNumber + "! = " + factorial);
		System.out.println("------------------------");
		findBiggestFactorial();
	}

	private static long factorial(int originalNumber) {
		int num = originalNumber;
		long factorial = (long) num;
		
		while(num>1){
			factorial *= --num;
		}
		
		return factorial;
	}
	
	private static void findBiggestFactorial() {
		int biggestInt = 0;
		long longValue = 0;
		int biggestFactorial = 0;
		int count = 1;
		
		while(biggestInt == longValue){
			biggestInt = (int) factorial(count);
			longValue = factorial(count);
			System.out.println(count + "! = " + "int: " + biggestInt + " - " + "long: " + longValue);
			count++;
		}
		
		biggestFactorial = count-2;
		System.out.println("The biggest factorial that can be stored in an int is " + biggestFactorial + "!");
		
	}
}
