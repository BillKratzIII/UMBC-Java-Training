package examples.io;
import java.io.*;
public class WriteTextFile {
    public static void main(String a[]) {
        int iValue = 10;
        double dValue = 12.3;
        
        PrintWriter pw = null;
        try {
            pw = new PrintWriter (new FileWriter(a[0]));

            pw.println("The integer is " + iValue);
            pw.println("The double is " + dValue);
            
        } catch(FileNotFoundException e) {
            System.err.println("Can't open " + a[0]);
            e.printStackTrace();
        } catch(IOException e) {
            System.err.println("IOError: ");
            e.printStackTrace();            
        } finally {
            if (pw != null)
                pw.close();
        }
    }
}
