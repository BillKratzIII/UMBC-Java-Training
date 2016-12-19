package examples.networking;
import java.net.*;
import java.io.*;
public class ReadWebPage {
    public static void main(String args[]) {
        try {
            URL web = new URL("http://" + args[0]);
            InputStream  is = web.openStream();
            int aByte = 0;
            while((aByte = is.read()) != -1)
                System.out.print((char) aByte);
            is.close();
        } catch(MalformedURLException e)  {
            System.out.println("Malformed");
        } catch(IOException e) {
            System.out.println("IOException");
        }
    }
}