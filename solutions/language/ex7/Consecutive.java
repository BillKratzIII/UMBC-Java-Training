package solutions.language.ex7;
public class Consecutive {
    public static void main(String args[]) {
        int sum, baseNum, consecNum, answerNum = 1;
        for (baseNum = 1; baseNum < 10000; baseNum++) {
            sum = 0;
            for ( consecNum = baseNum; consecNum < 10000; consecNum++) {
                sum += consecNum;
                if (sum > 10000)
                   break; // no need to continue inner loop
                else if (sum == 10000) {
                    System.out.println("Solution " + answerNum++);
                    for (int m = baseNum; m <= consecNum; m++)
                        System.out.print(m + " ");
                    System.out.println('\n');
                } // end else if
            } // end for ( consecNum = ...
        } // end for (baseNum = ...
    } // end main
}