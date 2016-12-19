package examples.encapsulation;
public class TestLine {
    public static void main(String args[]) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Line lineA = new Line(p1,p2);
        System.out.println("Line A: " + lineA);
        System.out.println(lineA.getLength());

        Line lineB = new Line(0,0,6,8);
        System.out.println("Line B: " + lineB);
        System.out.println(lineB.getLength());
    }
}