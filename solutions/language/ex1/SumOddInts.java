package solutions.language.ex1;
public class SumOddInts {
    public static void main(String args[]) {
        int begin = 1;
        int end = 100;
        int total = 0;
        for (int i = 1; i < end; i += 2){
            total += i;
        }
        System.out.println("Total = " + total);
    }
}