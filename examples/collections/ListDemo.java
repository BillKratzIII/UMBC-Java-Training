package examples.collections;
import java.util.*;
public class ListDemo {
    public static void main(String args[]) {
        List list = new ArrayList();
        for (int i = 0; i < args.length; i++)
            list.add(args[i]);
        System.out.println("ArrayList:");
        printList(list);
        list = new LinkedList();
        for (int i = 0; i < args.length; i++)
            list.add(args[i]);
        System.out.println("LinkedList:");
        printList(list);
    }
    public static void printList(Collection data){
        Iterator iter = data.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        System.out.println();
    }
}