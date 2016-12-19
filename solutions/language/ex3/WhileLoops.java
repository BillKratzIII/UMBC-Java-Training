package solutions.language.ex3;
public class WhileLoops {
    public static void main(String args[]) {
        int i = 7, j;
        while(i >= 1) {
            j = 1;
            while(j <= i) {
                System.out.print(j + " " );
                j++;
            } // end while j loop
            System.out.println();
            i--;
        } // end while j loop
    } // end main
}