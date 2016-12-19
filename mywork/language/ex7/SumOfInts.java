package mywork.language.ex7;

/**
 * 
 * @author William Kratz
 * Program that when run produces the sets of consecutive integers totaling exactly 10,000.
 *
 */

public class SumOfInts {
	public static void main(String[] args) {
		
		int startingNumber = 0;
		
		while(startingNumber <5000){
			findTenThousand(startingNumber);
			startingNumber++;
		}
		
		
	}
	
	public static void findTenThousand(int startingNumber){
		int sum = 0;
		int count = startingNumber;
		
		while(sum<10000){
			sum = sum + count;
			if(sum == 10000){
				System.out.println("BOOM!");
				printResult(count);
			}
			count++;
		}
	}
	
	public static void printResult(int endingNumber){
		int sum = 10000;
		
		while(sum>0){
			System.out.print(endingNumber + ", ");
			
			sum -= endingNumber;
			endingNumber--;
		}
		System.out.println();
	}

}
