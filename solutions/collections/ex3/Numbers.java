package solutions.collections.ex3;
import java.util.*;
public class Numbers {
    public static void main(String args[]) {
        ArrayList numList = new ArrayList();
        for(int i = 0; i < args.length; i++){
            numList.add(new Double(args[i]));
        }
        Double d;
        double total = 0.0;
        double theNum;
        for(int i = 0; i < numList.size(); i++){
            d = (Double) numList.get(i);
            theNum = d.doubleValue();
            System.out.print( theNum + " ");
            total += theNum;
        }
        System.out.println();
        System.out.println("Total is: " + total);
        total = 0;
        Iterator iter = numList.iterator();
        while(iter.hasNext()){
            d = (Double) iter.next();
            theNum = d.doubleValue();
            System.out.print( theNum + " ");
            total += theNum;
        }
        System.out.println();
        System.out.println("Total is: " + total);
    }
}

