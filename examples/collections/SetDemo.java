package examples.collections;
import java.util.*;
public class SetDemo {
    public static void main(String args[]) {
        Set uniqueWords = new HashSet();
        for (int i = 0; i < args.length; i++)
                uniqueWords.add(args[i]);
        System.out.println("HashSet:");
        ListDemo.printList(uniqueWords);
        uniqueWords = new TreeSet();
        for (int i = 0; i < args.length; i++)
                uniqueWords.add(args[i]);
        System.out.println("TreeSet:");
        ListDemo.printList(uniqueWords);
    }
}