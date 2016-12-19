package examples.io;
import java.io.*;
public class FileCopy {
    public static void main(String a[]) {
        int aByte;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(a[0]);
            fos = new FileOutputStream(a[1]);
            while((aByte =  fis.read()) != -1)
                fos.write(aByte);
        } catch(FileNotFoundException e) {
            System.err.println("File Not Found");
            e.printStackTrace();
        } catch(IOException e) {
            System.err.println("IOError: ");
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                     fis.close();
                if (fos != null)
                     fos.close();
            } catch(IOException e){
                // ignore the exception
            }
        }
    }
}
