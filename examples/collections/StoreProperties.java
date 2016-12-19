package examples.collections;
import java.util.*;
import java.io.*;
public class StoreProperties{
    public static void main(String args[])
      throws IOException{
        FileOutputStream fos =
            new FileOutputStream(args[0]);
        Properties p = new Properties();
        p.setProperty("fontsize", "12");
        p.setProperty("fontcolor", "green");
        p.store(fos, "header comment");
        fos.close();
    }
}