package mywork.intro.ex2;

public class DefiningVariables {
	public static void main(String args[]) {
		int a = 17, b = 4;

		//PRACTICE WITH ADDITION
		System.out.println(a + " + " + b + " = " + addition(a,b));

		//PRACTICE WITH DIVISION
		System.out.println(a + " / " + b + " = " + division(a,b));

		//PRACTICE WITH MODULUS
		System.out.println(a + " % " + b + " = " + modulus(a,b));

	}

	public static int addition(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

	public static int division(int a, int b) {
		int c;
		c = a / b;
		return c;
	}

	public static int modulus(int a, int b) {
		int c;
		c = a % b;
		return c;
	}

}