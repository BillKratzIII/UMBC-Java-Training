package examples.io;
import java.io.*;
public class Keyboard {
    public static void main(String args[]) {
        int val;
        try {
            while((val =  System.in.read()) != -1)
                System.out.print((char)val);
        } catch(IOException e) {
            System.err.println("Error: " + e);
        }
    }
}