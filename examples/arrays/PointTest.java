package examples.arrays;
public class PointTest {
    public static void main(String args[]) {
        Point data[];
        data = new Point[3];
        data[0] = new Point(2,3);
        data[1] = new Point(4,5);
        data[2] = new Point(6,7);
        for (int i = 0; i < data.length; i++)
            System.out.println(data[i].toString());
    }
}