package examples.inheritance;
public class  Point {
    int xc = 1;
    int yc = 2;

    public Point(int x, int y) {
        xc = x;
        yc = y;
    }
    public int getXc() {
        return xc;
    }
    public int getYc() {
        return yc;
    }
    public String toString() {
        return xc + "," + yc;
    }
}