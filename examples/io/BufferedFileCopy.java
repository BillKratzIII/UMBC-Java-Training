package examples.io;
import java.io.*;
public class BufferedFileCopy {
    public static void main(String a[]) {
        String theLine;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(a[0]);
            br = new BufferedReader(fr);
            while((theLine = br.readLine()) != null){
                System.out.println(theLine);
            }
        } catch(FileNotFoundException e) {
                System.err.println("File Not Found");
                e.printStackTrace();
        } catch(IOException e) {
                System.err.println("IOError: ");
                e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch(IOException e){
                // ignore the exception
            }
        }
    }
}
