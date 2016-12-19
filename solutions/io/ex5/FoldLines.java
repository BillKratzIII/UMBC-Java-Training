package solutions.io.ex5;
import java.io.*;
public class FoldLines {
    public static void main(String args[]) throws IOException {
        if ( args.length == 1)
            foldLines(Integer.parseInt(args[0]), System.in);
        else if (args.length == 2) {
            FileInputStream fis = new FileInputStream(args[1]);
            foldLines(Integer.parseInt(args[0]), fis);
            fis.close();
        }
        else
            System.out.println("java FoldLines number filename");
    }
    public static void foldLines(int foldWidth, InputStream file) throws IOException {
        int theByte;
        int ct = 1;
        while((theByte = file.read()) != -1)
        {
            System.out.print((char) theByte);
            if (theByte == '\n')
                ct = 0;
            if (ct == foldWidth) {
                System.out.println();
                ct = 0;
            }
            ct++;
        }
    }
}
