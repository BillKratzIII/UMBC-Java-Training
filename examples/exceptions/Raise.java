package examples.exceptions;
public class Raise {
    public static void main(String args[]) {
        double base, expo, result;

        base = Double.parseDouble(args[0]);
        expo = Double.parseDouble(args[1]);
        result = Math.pow(base, expo);
        System.out.println(result);
    }
}