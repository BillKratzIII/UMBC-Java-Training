package examples.ooprogramming;


public class LoanTest {
    public static void main(String args[]) {
        Loan myLoan = new Loan();

        myLoan.setName("James");
        myLoan.setAmount(250000);
        myLoan.setRate(4.0);
        myLoan.setYears(30);

        String theName = myLoan.getName();
        System.out.println(theName);
        // Could have been combined as
        // System.out.println(myloan.getName());

        System.out.println(myLoan.getAmount());
        System.out.println(myLoan.getRate());
        System.out.println(myLoan.getYears());
        
        Loan mortgage = new Loan("Bill", 245000, 3.75, 30);
        mortgage.printLoan();
    }
}