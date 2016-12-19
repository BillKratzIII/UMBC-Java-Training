package examples.io;
import java.io.*;
public class TextFileCopy {
    public static void main(String a[]) {
        int aChar;
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(a[0]);
            fw = new FileWriter(a[1]);
            while((aChar =  fr.read()) != -1)
                fw.write(aChar);
        } catch(FileNotFoundException e) {
            System.err.println("File Not Found");
            e.printStackTrace();
        } catch(IOException e) {
            System.err.println("IOError: ");
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                     fr.close();
                if (fw != null)
                     fw.close();
            } catch(IOException e){
                // ignore the exception
            }
        }
    }
}
