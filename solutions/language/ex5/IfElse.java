package solutions.language.ex5;
public class IfElse {
    public static void main(String args[]) {
        for (int i = -4; i <= 4; ++i) {
            if ( i == 0){
                System.out.println(i + " is even");
            } // end if ( i == 0)
            else if (i < 0) {
                System.out.print(i + " is negative and ");
                if ( i % 2 == 0)
                    System.out.println("even");
                else
                    System.out.println("odd");
            } // end else if (i < 0)
            else {
                System.out.print(i + " is positive and ");
                if ( i % 2 == 0)
                    System.out.println("even");
                else
                    System.out.println("odd");
            } // end else
        } // end for i loop
    } // end main
}