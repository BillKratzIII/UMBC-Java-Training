package examples.collections;
import java.util.Hashtable;
public class HashTest  {
    public static void main(String args[]) {
        Hashtable caps = new Hashtable();
        caps.put("Providence", "RI");
        caps.put("Boston", "MA");
        caps.put("Hartford", "CT");
        for ( int i = 0; i < args.length; i++) {
            Object val  = caps.get(args[i]);
            if ( val == null)
                System.out.println(args[i] +
                        ": is not a capital");
            else
                System.out.println(args[i] +
                        " is capital of " + val);
        }
    }
}