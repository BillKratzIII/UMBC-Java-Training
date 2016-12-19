package examples.inheritance;
public class LoanTests{
    public static void main(String args[]){

        Loan loans[] = {
            new Loan("Susan", 50000, 6.0, 30),
            new BusinessLoan("Alan", 75000, 7.0,
                             30, 21046, 1000000),
            new CarLoan("Michael", 30000, 4.5,
                        5, "Mazda", "Miata")};
        for(int i = 0; i < loans.length; i++){
            displayLoanInfo(loans[i]);
        }
        System.out.print("Total interest: ");
        System.out.println(calcInterest(loans));
    }

    public static void displayLoanInfo(Loan loan){
        print("  Name : " + loan.getName());
        print("Amount : " + loan.getAmount());
        print("  Rate : " + loan.getRate());
        print("Years  : " + loan.getYears());
        print("Payment: " + loan.computePayment());
        print("");
    }

    public static double calcInterest(Loan loans []){
        double total = 0.0;
        for(int i = 0; i < loans.length; i++){
            total += loans[i].totalInterest();
        }
        return total;
    }

    public static void print(String s){
        System.out.println(s);
    }
}