package solutions.exceptions.ex1;
public class CatchMe {
    public static void main(String args[]) {
        try {
            middle(args);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("main: ArrayIndexOutOfBoundsException");
        } finally{
            System.out.println("main: finally");
        }
    }
    public static void middle(String args[]){
        try {
            innermost(args);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("middle: StringIndexOutOfBoundsException");
        } finally {
            System.out.println("middle: finally");
        }
    }
    public static void innermost(String args[]) {
        int a, b, c;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            a = args[2].charAt(100);
        } catch(NumberFormatException e) {
            System.out.println("innermost: NumberFormatException");
        }
        finally {
            System.out.println("innermost: finally");
        }
    }
}
