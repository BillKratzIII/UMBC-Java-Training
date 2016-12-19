package examples.inheritance;
public class EqualityTest {
    public static void main(String args[]) {

        Point p1 = new Point(2,3);
        Point p2 = new Point(2,3);
        Point p3 = new Point(7,8);

        if ( p1.equals(p2) )
            System.out.println(p1 + " = " + p2);
        else
            System.out.println(p1 + " != " + p2);

        if ( p1.equals(p3) )
            System.out.println(p1 + " = " + p3);
        else
            System.out.println(p1 + " != " + p3);

        p1 = p3;
        if ( p1.equals(p3) )
            System.out.println(p1 + " = " + p3);
        else
            System.out.println(p1 + " != " + p3);
    }
}