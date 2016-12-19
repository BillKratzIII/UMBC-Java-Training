package mywork.methods.ex4;

import java.text.DecimalFormat;

/**
 * 
 * @author William Kratz
 * Class holds information about a loan and methods
 * to calculate the monthly payment of the loan.
 *
 */

public class Loan {
	//Instance variables
	String name;
	double amount, rate;
	int years;
	double interest[];
	double principal[];
	double balance[];

	//Constructors
	public Loan(String name, double amount, double rate, int years) {
		this.name = name;
		this.amount = amount;
		this.rate = rate;
		this.years = years;
		interest = new double[years*12];
		principal = new double[years*12];
		balance = new double[years*12];
	}

	public Loan() {
	}

	//Setters
	public void setName(String n) {
		name = n;
	}

	public void setAmount(double a) {
		amount = a;
	}

	public void setRate(double r) {
		rate = r;
	}

	public void setYears(int y) {
		years = y;
	}

	//Getters
	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public double getRate() {
		return rate;
	}

	public int getYears() {
		return years;
	}

	//method prints out information about the loan to the console
	public void printLoan() {
		System.out.println(name);
		System.out.println(amount);
		System.out.println(rate);
		System.out.println(years);
	}
	
	
	//method returns the monthly payment in a formatted String
	public String computePmnt() {
		DecimalFormat df = new DecimalFormat("0.00");
		double rateInDecimal = rate/(12*100);
		int numMonths = years*12;
		double monthlyPmnt = amount*(rateInDecimal/(1-(Math.pow((1+rateInDecimal), -numMonths))));
		return df.format(monthlyPmnt);
	}
	
	//method fills the arrays with data regarding the loan
	private void amortizeLoan(){
        double owed;
        owed = amount;
        double payment = Double.valueOf(computePmnt());
        for (int i = 0; i < years * 12; i++) {
            interest[i]  = owed * (rate / (12 * 100));
            principal[i] = payment - interest[i];
            balance[i] = owed - principal[i];
            owed = balance[i];
        }
    }
	
	//method prints a table of the loan data
	public void printTable(int months) {
        if(months <= interest.length) {
			DecimalFormat df = new DecimalFormat("#,###.00");
        
			amortizeLoan();
			System.out.println("MONTH\tINTEREST\tPRINCIPAL\tBALANCE");
			for(int i=0; i<months; i++) {
				System.out.println((i+1) + "\t$" + df.format(interest[i]) + "\t$" + df.format(principal[i]) + "\t$" + df.format(balance[i]));
			}
        } else {
        	System.out.println("ERROR: Invalid number of months specified");
        }
	}
	
	//method returns the total amount of interest paid over the life of the loan
	public String totalInterest() { 
		amortizeLoan();
		double sum = 0.0;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for (int i = 0; i < interest.length; i++) {
			sum+=interest[i];
		}
		
		return "$" + df.format(sum);
	}
}
