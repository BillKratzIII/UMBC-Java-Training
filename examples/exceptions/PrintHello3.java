package examples.exceptions;
// Handling it with an exception handler
public class PrintHello3 {
    public static void main(String args[]) {
        while(true) {
            System.out.println("hello");
            try {
                Thread.sleep(2000);
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}