package starters.encapsulation.ex1;
public class Fraction {
    private int numer, denom;

    public Fraction(int numer, int denom){
        // use of "this" is required here
        this.numer = numer;
        this.denom = denom;
    }
    public Fraction(){
        this(0,1);
    }
    public Fraction multiply(Fraction p) {
        Fraction temp = new Fraction();
        // use of "this" is optional here
        // simply used for clarity
        temp.numer = numer * p.numer;
        temp.denom = denom * p.denom;
        return temp;
    }
    public String toString() {
        int val = this.gcd(numer, denom);
        return numer/val + "/" + denom/val;
    }
    private int gcd(int top, int bot) {
        int quot, rem;
        quot = top / bot;
        rem = top % bot;
        while(rem != 0) {
            top = bot;
            bot = rem;
            quot = top / bot;
            rem = top % bot;
        }
        return bot;
    }
    public Fraction add(Fraction f){
        // **** TODO ***
        return null;
    }
    public Fraction subtract(Fraction f){
        // **** TODO ***
        return null;
    }
    public Fraction divide(Fraction f){
        // **** TODO ***
        return null;
    }

}