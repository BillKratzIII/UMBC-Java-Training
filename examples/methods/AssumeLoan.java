package examples.methods;
public class AssumeLoan {
    public static void main(String args[]) {
        Loan loanA =
            new Loan("Mike", 100000.0, 9.0, 30);
        Loan loanB =
            new Loan("Alan", 50000.0, 6.0, 30);
        System.out.println("Before: " + loanA);
        System.out.println("Before: " + loanB);
        loanA.assume(loanB);
        System.out.println("After: " + loanA);
        System.out.println("After: " + loanB);
    }
}