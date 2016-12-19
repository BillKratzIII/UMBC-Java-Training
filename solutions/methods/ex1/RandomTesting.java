package solutions.methods.ex1;
public class RandomTesting {
    public static void main(String args[]) {

        int count = 0, low = 0, high = 0;
        long begin = System.currentTimeMillis();
        long end;
        double rand;

        for ( int i = 0; i < 10000; i++) {
            rand = Math.random();
            count++;
            if ( rand < .5)
                low++;
            else
                high++;
        }
        System.out.println("HIGH = " + high + "\nLOW = " + low);

        while(low != high) {
            rand = Math.random();
            count++;
            if ( rand < .5)
                low++;
            else
                high++;
            if ( count == 1000000){
                System.out.println("HIGH = " + high + "\nLOW = " + low);
                System.out.println("One Million Reached");
                end = System.currentTimeMillis();
                System.out.println("Elapsed Time in msec: " + (end - begin));
                System.exit(2);
            }
        }
        System.out.println("HIGH = " + high + "\nLOW = " + low);
        System.out.println(high + low + " Reached");
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in msec: " + (end - begin));
        System.exit(2);
    }
}