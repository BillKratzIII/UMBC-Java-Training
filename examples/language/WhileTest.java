package examples.language;
public class WhileTest {
    public static void main(String args[]) {
        int low = 10, high = 20, sum = 0;
        int save = low;
        while( low <= high ) {
            sum += low++;
            System.out.println("Partial Sum:" + sum);
        }
        System.out.print("Sum of ints from ");
        System.out.print(save + " to " + high);
        System.out.println(" is " + sum);
    }
}