package examples.ooprogramming;
public class StringComparisons {
    public static void main(String args[]){
        String x = new String("mike");
        String y = new String("mike");
        System.out.println(x == y);
        String b = "mike";
        String c = "mike";
        System.out.println(b == c);
        System.out.println(x == c);
        x = "mike";
        y = "mike";
        System.out.println(x == y);
        System.out.println(x == c);
    }
}