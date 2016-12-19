package examples.exceptions;
public class TestCircle2 {
    public static void main(String args[])
      throws NegativeException {
        Circle c = new Circle(1, 1, -5);
    }
}