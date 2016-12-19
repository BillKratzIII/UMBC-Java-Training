package examples.collections;
import java.util.*;
public class AccountTest {
    public static void main(String args[]) {
        Hashtable accounts = new Hashtable();
        // Obtain account names from command line
        Account val;
        Integer key;
        for(int i = 0; i < args.length; i++){
            val = new Account(args[i]);
            key = new Integer(val.getAccNumber());
            accounts.put(key, val);
        }
        Enumeration e = accounts.keys();
        while(e.hasMoreElements()){
            key = (Integer) e.nextElement();
            val = (Account) accounts.get(key);
            System.out.print(val.getName());
            System.out.print(" account number ");
            System.out.println(key.intValue());
        }
    }
}