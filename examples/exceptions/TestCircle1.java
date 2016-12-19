package examples.exceptions;
public class TestCircle1 {
    public static void main(String args[]){
        try{
            Circle c = new Circle(1, 1, -5);
        } catch (NegativeException ne) {
            int x = ne.getNegativeValue();
            System.out.println(x);
            System.out.println(ne);
        }
    }
}