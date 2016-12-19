package mywork.methods.ex4;

/**
 * 
 * @author William Kratz
 * Class to test methods written in the Loan class.
 *
 */

public class LoanTest {

	public static void main(String[] args) {
		
		//LOAN OBJECT myLoan
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
        System.out.println("Monthly Payment: $" + myLoan.computePmnt());
        System.out.println();
        
        
        //LOAN OBJECT mortgage
        Loan mortgage = new Loan("Bill's Mortgage", 245000, 3.75, 30);
        mortgage.printLoan();
        System.out.println("Monthly Payment: $" + mortgage.computePmnt());
        System.out.println();
        
        
        //LOAN OBJECT test
        Loan test = new Loan("Test Loan", 200000, 7.5, 30);
        System.out.println("Monthly Payment: $" + test.computePmnt());
        System.out.println();
        
        //LOAN OBJECT loanA
        Loan loanA =
                new Loan("Mike", 200000.0, 7.5, 30);
            String payment = loanA.computePmnt();
            System.out.println("Monthly Payment: " + payment);
            loanA.printTable(360);
            System.out.println("Total Interest Paid: " + loanA.totalInterest());
             

	}

}
