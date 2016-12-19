package mywork.language.ex3;

/**
 * 
 * @author Trainer
 *Program that when run displays a specific output using nested while loops.
 *
 */

public class NestedWhileLoops {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int count = 8;
		
		while (i < 8){	
			while (j<count){
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
			count--;
		}
	}
}
