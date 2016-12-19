package mywork.language.ex2;

/**
 * 
 * @author William Kratz
 *Program that when run will display a specific output using nested for loops. 
 *
 */

public class NestedForLoops {
	public static void main(String[] args) {
		for (int i=1; i<8; i++) {
			System.out.print(i);
			for (int j=8; j>0; j--){
				if (j < i){
					System.out.print(" " + j);
				}
			}
			System.out.println();
		}
	}
}
