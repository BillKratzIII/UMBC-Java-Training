package solutions.exceptions.ex3;
public class SimpleDateTester{
    public static void main(String args[]) throws BadMonthException {
        SimpleDate sd1 = new SimpleDate(13, 1, 2004);
        System.out.println(sd1);
    }
}