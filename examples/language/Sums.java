package examples.language;
public class Sums {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 50; i = i + 1) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}