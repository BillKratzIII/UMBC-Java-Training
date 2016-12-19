package examples.inheritance;
public class BusinessLoan extends Loan {
    private int zipCode;
    private double sales;
    public BusinessLoan(String n, double a, double r,
                        int y, int z, double sa) {
        super(n, a, r, y);
        zipCode = z;
        sales = sa;
    }
    public int getZip() {
        return zipCode;
    }
    public double getSales() {
        return sales;
    }
    public String toString(){
        StringBuffer sb
            = new StringBuffer(super.toString());
        sb.append(", ");
        sb.append(zipCode);
        sb.append(", ");
        sb.append(sales);
        return sb.toString();
    }
}