package examples.language;
public class IfTest {
    public static void main(String args[]) {
    	int hour = 2;
        if (hour < 6)
            System.out.println("Too early");
        else if (hour < 12) {
            System.out.print("Good morning, ");
            System.out.println("how are you?");
        }
        else if (hour < 18)
            System.out.println("Good afternoon");
        else
            System.out.println("Good evening");
    }
}