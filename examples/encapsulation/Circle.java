package examples.encapsulation;
public class Circle {
    private int xc, yc, radius;
    public Circle(int x, int y, int rad){
        xc = x;
        yc = y;
        if(rad < 0){
            print("Bad radius: " + rad);
            print("Default value of 1 being used");
            rad = 1;
        }
        radius = rad;
    }
    public Circle(int x, int y) {
        this(x, y, 1);
    }
    public Circle(int rad) {
        this(0, 0, rad);
    }
    public Circle() {
        this(0, 0, 1);
    }
    public double calcArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return xc + "," + yc + ": rad = " + radius;
    }
    public int getXc(){
        return xc;
    }
    public int getYc(){
        return yc;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        if(r < 0){
            print("Bad radius: " + r);
            print("radius " + radius + "unchanged" );
            return;
        }
        radius = r;
    }
    private void print(String msg){
        System.out.println(msg);
    }
}