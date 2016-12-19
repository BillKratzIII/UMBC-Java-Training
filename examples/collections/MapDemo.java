package examples.collections;
import java.util.*;
public class MapDemo {
    public static void main(String argv[]) {
        Map cities = new TreeMap();
        cities.put("Richmond", "Virginia");
        cities.put("Boston", "Massachusetts");
        cities.put("Richmond", "Virginia");
        Set set = cities.keySet();
        Iterator iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}