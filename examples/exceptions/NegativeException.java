package examples.exceptions;
public class NegativeException extends Exception {
      // instance variable to hold the negative
      // value that represents the error
      private int n;

      // Constructor
      public NegativeException(String msg, int num) {
        // parent class already knows how to handle
        // the message so we will pass it to the
        // constructor in our parent class
        super(msg);

        // we will handle the number here
        n = num;
      }
      public int getNegativeValue() {
        return n;
      }
}