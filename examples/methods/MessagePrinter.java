package examples.methods;
import java.util.*;
public class MessagePrinter {
    public static void main(String args[]){
        String s = "Static Method Demo";
        BorderPrinter.boxIt(s);
        String msg = "message to be converted";
        titleCase(msg);
        msg = "another simple message";
        titleCase(msg);
    }
    public static void titleCase(String s){
        StringTokenizer st = new StringTokenizer(s);
        String tmp;
        String first;
        while(st.hasMoreTokens()){
            tmp = st.nextToken();
            first = tmp.substring(0,1).toUpperCase();
            System.out.print(first);
            System.out.print(tmp.substring(1) + " ");
        }
        System.out.println();
    }
}