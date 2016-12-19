package examples.language;
public class DataTypes {
    public static void main(String args[]) {
      int a = 10, b = 3;
      System.out.print(a + " * " + b + " = ");
      System.out.println(a * b);

      double x = 3.5;
      System.out.print(a + " + " + a + " * " + x);
      System.out.println(" = " + (a + a * x));
      
      System.out.println("A can be represented as:");
      System.out.print("A" + " or " + 'A' + " or ");
      System.out.println('\u0041');

      System.out.println("Water Freezes @ 32\u00B0");
      boolean c;
      c = a == b;
      System.out.print("The statement " + a);
      System.out.println(" == " + b + " is " + c);
      
      c = a != b;
      System.out.print("The statement " + a);
      System.out.println(" != " + b + " is " + c);
    }
}