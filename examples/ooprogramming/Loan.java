package examples.ooprogramming;
public class Loan {
    String name;
    double amount, rate;
    int years;
    
    public Loan(String name, double amount, double rate, int years) {
		super();
		this.name = name;
		this.amount = amount;
		this.rate = rate;
		this.years = years;
	}
    
	public Loan() {
		super();
	}

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
    
    public void printLoan() {
    	System.out.println(name);
    	System.out.println(amount);
    	System.out.println(rate);
    	System.out.println(years);
    }
}