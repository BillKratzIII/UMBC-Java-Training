package mywork.language.ex4;

/**
 * 
 * @author William Kratz
 *Program that when ran will print a table showing the even integers between 20 and 60 in the first column,
 *their squares in the 2nd column, and their cubes in the 3rd column.
 *
 */

public class EvenIntSquareCubes {
	public static void main(String[] args) {
		System.out.println("Int" + "\t" + "i sq" + "\t" + "i cu");
		System.out.println("____" + "\t" + "_____" + "\t" + "_______");
		for (int i=20; i<=60; i+=2){
			System.out.print(i + "\t");
			System.out.print((i*i) + "\t");
			System.out.println((i*i*i) + "\t");
		}
	}

}
