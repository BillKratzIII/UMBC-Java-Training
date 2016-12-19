package examples.collections;
import java.util.*;
public class Search  {
    public static void main(String args[]) {
        List list = new ArrayList();
        for (int i = 0; i <= 100; i += 2)  {
            Integer ival = new Integer(i);
            list.add(ival);
        }
        for (int i = 0; i < args.length; i++)  {
            Integer find = new Integer(args[i]);
            int pos =
                Collections.binarySearch(list, find);
            if (pos >= 0 )
                System.out.println(args[i] +
                    " found: at pos " + pos);
            else
                System.out.println(args[i] +
                    " not found");
        }
    }
}