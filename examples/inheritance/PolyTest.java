package examples.inheritance;
public class PolyTest {
    public static void main(String args[]) {
        Point data [] = { new Point(1,2),
                          new Point3D(1,2,3),
                          new Point(2,3),
                          new Point3D(2,3,4) };

        for (int i = 0; i < data.length; i++)
            System.out.println(data[i]);
    }
}