package starters.arrays.ex4;
public class LoanTest {
    public static void main(String args[]) {
        Loan loanA =
        new Loan("Mike", 200000.0, 7.5, 30);
        double payment = loanA.computePayment();
        System.out.println("Monthly Payment: " + payment);
    }
}