package solutions.language.ex2;
public class ForLoops {
    public static void main(String args[]) {
        for ( int i = 1; i <= 7; i++) {
            for (int  j = i; j >= 1; j-- ) {
                System.out.print(j + " " );
            } // end for j loop
            System.out.println();
        } // end for i loop
    } // end of main
}