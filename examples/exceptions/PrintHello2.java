package examples.exceptions;
// Passing it up the call stack
public class PrintHello2 {
    public static void main(String args[])
        throws InterruptedException{
        while(true) {
            System.out.println("hello");
            Thread.sleep(2000);
        }
    }
}