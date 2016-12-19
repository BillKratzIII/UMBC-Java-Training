package examples.encapsulation;
public class Line {

    private Point p1;
    private Point p2;
    private double length;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        length = distance(p1, p2);
    }
    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1,y1), new Point(x2,y2));
    }
    private double distance(Point p1, Point p2) {
        double xd = p1.getXc() - p2.getXc();
        double yd = p1.getYc() - p2.getYc();
        return Math.sqrt(xd * xd + yd * yd);
    }
    public double getLength () {
        return length;
    }
    public String toString() {
        return p1.toString()+ "; " + p2.toString();
    }
}