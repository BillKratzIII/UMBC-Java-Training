package solutions.methods.ex2;
public class TestCount {
    public static void main(String args[]) {
        String x = "12431  31 \t\n3";
        StringBuffer y = new StringBuffer("4\t\t  \n335  353453");
        System.out.println(Count.digits(x));
        System.out.println(Count.digits(y));
        System.out.println(Count.whitespace(x));
        System.out.println(Count.whitespace(y));
    }
}