package solutions.encapsulation.ex1;
public class FractionTest {
    public static void main(String args[]) {
        Fraction a = new Fraction(2,3);
        Fraction b = new Fraction(3,4);
        Fraction c = a.add(b);
        System.out.println(c);

        a = new Fraction(2,3);
        b = new Fraction(5,6);
        c = a.add(b);
        System.out.println(c);

    }
}