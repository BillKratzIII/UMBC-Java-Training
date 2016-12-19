package examples.language;
public class ContinueDemo {
    public static void main(String args[]) {
        // for loop example
        int i, sum = 0;
        for ( i = 1; i <= 100; i = i + 1){
            if ((i % 3 ) == 0 )
                continue;
            sum = sum + i;
        }
        System.out.println("sum "  + sum);

        //while loop example
        i = 0;
        sum = 0;
        while (++i <= 100){
            if ((i % 3 ) == 0 )
                continue;
            sum = sum + i;
        }
        System.out.println("sum "  + sum);
    }
}