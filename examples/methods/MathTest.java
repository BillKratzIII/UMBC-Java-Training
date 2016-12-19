package examples.methods;
public class MathTest {
    public static void main(String args[]) {
        double y;

        // square root of a number
        y = Math.sqrt(25.0);
        System.out.println("Sqrt:   " + y);

        // 3 raised to the 4th power
        y = Math.pow(3.0, 4.0);
        System.out.println("Powers:    " + y);

        // random number between 0 and 1
        y = Math.random();
        System.out.println("Random: " + y);

        // Round a number to nearest long
        long z;
        z = Math.round(-2.6);
        System.out.println("Rounding: " + z);
    }
}