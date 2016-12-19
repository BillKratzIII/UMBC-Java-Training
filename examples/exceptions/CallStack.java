package examples.exceptions;
public class CallStack {
    public static void main(String args[])
      throws InterruptedException {
        methodA();
    }

    public static void methodA()
      throws InterruptedException {
        System.out.println("hello");
        Thread.sleep(2000);
    }
}