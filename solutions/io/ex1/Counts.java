package solutions.io.ex1;
import java.io.*;
import java.util.*;
public class Counts {
    public static void main(String args[]) throws IOException {
        String line;
        int numlines = 0;
        int numchars = 0;
        int numwords = 0;

        FileInputStream fis = new FileInputStream(args[0]);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        StringTokenizer st = null;
        while((line = br.readLine()) != null) {
            numchars += line.length();
            numlines++;
            st = new StringTokenizer(line);
            while(st.hasMoreTokens()) {
                st.nextToken();
                numwords++;
            }
        }
        System.out.print(" File:  " + args[0]);
        System.out.print(" Chars: " + numchars);
        System.out.print(" Words: " + numwords);
        System.out.print(" Lines: " + numlines);
        System.out.println();
        br.close();
    }
}
