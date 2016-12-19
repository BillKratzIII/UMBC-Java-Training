package solutions.language.ex6;
public class Factorial {
    public static void main(String args[]) {
        int result = 1;
        int i = 1;

        while ( i <= 10 ){
            result *= i;
            System.out.println(i + " factorial = " + result);
            i++;
        }

        //  To compute the largest factorial which can be
        //  stored in an int, we proceed as before but we'll
        //  store the result of each factorial in an int and
        //  in a long.  If a value is too big for an int, the
        //  java run time will not tell you but some bits will
        //  br dropped and thus the value of the loing and the
        //  int will be different for the first value too big
        //  to be stored in the int.
        System.out.println("--------------------");
        long longresult = result;
        int goodValue = result;
        int goodCount = i - 1;
        while ( longresult == result ) {
            goodValue = result;
            goodCount = i - 1;
            longresult *= i;
            result = (int) longresult;
            System.out.println(i + " factorial =");
            System.out.println("     long " + longresult);
            System.out.println("      int " + result);
            i++;

        }
        System.out.println("--------------------");
        System.out.print("largest is " + goodCount + " factorial = ");
        System.out.println( goodValue);
    }
}