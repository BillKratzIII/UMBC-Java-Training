package examples.arrays;
public class  Point {
    int xc, yc;

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