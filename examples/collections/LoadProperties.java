package examples.collections;
import java.util.*;
import java.io.*;
public class LoadProperties{
    public static void main(String args[])
      throws IOException{
        FileInputStream fis =
            new FileInputStream(args[0]);
        Properties p = new Properties();
        p.load(fis);
        fis.close();
        Enumeration e = p.propertyNames();
        String key, val;
        while(e.hasMoreElements()){
            key = (String) e.nextElement();
            val = (String) p.get(key);
            System.out.println(key + " " + val);
        }
    }
}