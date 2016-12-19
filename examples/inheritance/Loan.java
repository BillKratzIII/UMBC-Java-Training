package examples.inheritance;
import java.text.DecimalFormat;
public class Loan {
    String name;
    double amount, rate;
    int years;

    // new instance data
    double interest[];
    double principal[];
    double balance[];

    public Loan(String n, double a, double r, int y){
        name = n;
        amount = a;
        rate = r;
        years = y;

        // new behavior
        interest = new double[years * 12];
        principal = new double[years * 12];
        balance = new double[years * 12];

    }
    public void assume(Loan source){
        double temp = source.amount;
        amount = amount + temp;
        source.amount = 0.0;
    }
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        sb.append(", ");
        sb.append(amount);
        sb.append(", ");
        sb.append(rate);
        sb.append(", ");
        sb.append(years);
        return sb.toString();
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
    public double computePayment() {
        double monthlyPayment;
        double j = rate / (12 * 100);
        int n = years * 12;
        monthlyPayment = amount * ( j / (1 - Math.pow( (1 + j), -n) ) );
        return monthlyPayment;
    }
    public double totalInterest(){
        amortizeLoan();
        double total = 0;
        for(int i = 0; i < 12 * years; i++){
            total += interest[i];
        }
        return total;
    }
    public void printAmortizationTable(int months){
        amortizeLoan();
        System.out.println("MONTH\tINT\tPRIN\tBAL");
        DecimalFormat df = new DecimalFormat("#,###.00");
        for(int i = 0; i < months; i++){
            System.out.print((i + 1) + "\t");
            System.out.print(df.format(interest[i]) + "\t");
            System.out.print(df.format(principal[i]) + "\t");
            System.out.println(df.format(balance[i]));
        }
    }
    private void amortizeLoan(){
        double owed;
        owed = amount;
        double payment = computePayment();
        for (int i = 0; i < years * 12; i++) {
            interest[i]  = owed * (rate / (12 * 100));
            principal[i] = payment - interest[i];
            balance[i] = owed - principal[i];
            owed = balance[i];
        }
    }

}
