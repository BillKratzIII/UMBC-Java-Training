package examples.methods;
public class CompoundInterest {
    public static void main(String args[]) {
        int years = 10;
        double rate = .10;
        double initial = 1000.00;
        double balance = initial;
        for (int i = 0; i < years; i++)
            balance += balance * rate;
        System.out.println(balance);

        years = 5;
        rate = .08;
        initial = 2000.0;
        balance = initial;
        for (int i = 0; i < years; i++)
            balance += balance * rate;
        System.out.println(balance);




    }
    public static double calcInterest(int yrs, double r, double start)
    {
        double balance = start;
        for (int i = 0; i < yrs; i++)
            balance += balance * r;
        return balance;
    }
}