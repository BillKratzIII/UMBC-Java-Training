package examples.methods;
import java.util.Date;
public class SystemStuff {
    public static void main(String args[]) {
        long t1 = System.currentTimeMillis();
        System.out.println("ms = " + t1);

        Date today = new Date(t1);
        System.out.println("Today is: " + today);

        if(Math.random() < .5){
            String s = "JVM terminating early";
            System.out.println(s);
            System.exit(1);
        }

        long day = 1000*60*60*24;
        Date tomorrow = new Date(t1 + day);
        System.out.println("Tomorrow: " + tomorrow);

        long t2 = System.currentTimeMillis();
        System.out.println("# of ms: " + (t2-t1));

        System.out.println("JVM terminating");
    }
}