package examples.inheritance;
public class CarLoan extends Loan {
    private String make;
    private String model;
    public CarLoan(String n, double a, double r,
                   int y, String mk, String mod) {
        super(n, a, r, y);
        make = mk;
        model = mod;
    }
    public String getMake()  { return make;   }
    public String getModel() { return model; }
    public String toString() {
        StringBuffer sb
            = new StringBuffer(super.toString());
        sb.append(", ");
        sb.append(make);
        sb.append(", ");
        sb.append(model);
        return sb.toString();
    }
}