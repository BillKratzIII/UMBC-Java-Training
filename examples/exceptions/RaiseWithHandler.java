package examples.exceptions;
public class RaiseWithHandler {
    public static void main(String args[]) {
        double base, expo, result;

        try {
            base = Double.parseDouble(args[0]);
            expo = Double.parseDouble(args[1]);
            result = Math.pow(base, expo);
            System.out.println(result);
        } catch(NumberFormatException nfe) {
            System.out.println(nfe);
        } catch(ArrayIndexOutOfBoundsException ai) {
            System.out.println(ai);
        } finally {
            System.out.println("Inside of finally");
        }
        System.out.println("Finished with handlers");
    }
}