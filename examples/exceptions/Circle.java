package examples.exceptions;
public class Circle {
    private int xc, yc, radius;
    public Circle(int x, int y, int rad)
      throws NegativeException {
        xc = x;
        yc = y;
        if(rad < 0)
            throw new NegativeException("Bad Radius",
                                         rad);
        radius = rad;
    }
    public Circle(int x, int y)
      throws NegativeException {
        this(x, y, 1);
    }
    public Circle(int rad)
      throws NegativeException {
        this(0, 0, rad);
    }
    public Circle()
      throws NegativeException {
        this(0, 0, 1);
    }
    public double calcArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return xc + "," + yc + ": rad = " + radius;
    }
    public int getXc()    { return xc; }
    public int getYc()    { return yc; }
    public int getRadius(){ return radius; }

    public void setRadius(int r)
      throws NegativeException {
        if(r < 0)
            throw new NegativeException("Bad Radius",
                                         r);
        radius = r;
    }
}