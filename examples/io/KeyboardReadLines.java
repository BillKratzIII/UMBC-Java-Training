package examples.io;
import java.io.*;
public class KeyboardReadLines {
    public static void main(String a[]) {
        InputStreamReader isr = null;
        BufferedReader br = null;

        String line;
        try {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            while(true) {
                System.out.print("Enter a line: ");
                line = br.readLine();
                if (line.equalsIgnoreCase("QUIT"))
                    break;
                System.out.println("You entered: "
                    + line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch(IOException e) {
            }
        }
    }
}