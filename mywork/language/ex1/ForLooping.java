package mywork.language.ex1;

/**
 * 
 * @author William Kratz
 * Java program that when run will display the sum of the odd integers from 1-100 to the console.
 *
 */

public class ForLooping {
	
	public static void main(String[] args) {
		shortWay();
		longWay();
		anotherWay();
	}

	private static void longWay() {
		int sum = 0;
		
		for (int i=1; i<=100; i++){
			if(isOdd(i)){
				System.out.print(sum + " + " + i + " ");
				sum = sum + i;
				System.out.println("= " + sum);
			}
		}
		
		System.out.println("The sum of the odd integers from 1 to 100 is " + sum + ", solved with the long method.");
	}
	
	public static boolean isOdd(int i){
		boolean isOdd=false;
		
		if(i%2!=0){
			isOdd = true;
		}
		
		return isOdd;
	}
	
	public static void shortWay(){
		int sum = 0;
		
		for (int i=1; i<100; i+=2){
			sum += i;
		}
		
		System.out.println("The sum of the odd integers from 1 to 100 is " + sum + ", solved with the short method.");
	}
	
	public static void anotherWay(){
		int sum = 0;
		
		for (int i=1; i<=100; i++){
			if(i%2==0){
				continue;
			}
			sum +=i;
		}
		
		System.out.println("The sum of the odd integers from 1 to 100 is " + sum + ", solved with the continue method.");
	}

}
