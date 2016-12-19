package examples.collections;
import java.util.Vector;
public class VectorTest {
    public static void main(String args[])  {
        Vector v = new Vector(100);
        print("SIZE = " + v.size());
        print("CAPACITY = " + v.capacity());
        Integer x = new Integer(10);
        v.add(x);
        v.add(new Double(10.5));
        v.add("Mike");

        print("SIZE = " + v.size());
        for (int i = 0; i < v.size(); i++)
            print(v.get(i));

        print(x + " at pos: " + v.indexOf(x));
        print(v);
        v.remove(1);
        print(v);
    }
    public static void print(Object o){
        System.out.println(o);
    }
}