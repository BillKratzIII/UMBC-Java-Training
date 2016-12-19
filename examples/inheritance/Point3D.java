package examples.inheritance;
public class Point3D extends Point {
    private int zc;

    public Point3D(int xc, int yc, int zc){
        super(xc, yc);
        this.zc = zc;
    }

    public int getZc() {
        return zc;
    }

    public String toString() {
        return super.toString() + "," + zc;
    }
}