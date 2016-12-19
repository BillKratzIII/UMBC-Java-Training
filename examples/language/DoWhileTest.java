package examples.language;
public class DoWhileTest {
    public static void main(String args[]) {
        int i = 1, sum = 0;
        do {
            sum += i++;
        } while( i <= 10 );
        System.out.println(sum);
    }
}