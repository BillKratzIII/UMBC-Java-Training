package solutions.arrays.ex2;
public class TemperatureConverter {
    public static void main(String args[]) {

        int begin = Integer.parseInt(args[0]);
        int end   = Integer.parseInt(args[1]);
        int step  = Integer.parseInt(args[2]);

        System.out.println("CELSIUS\tFAHRENHEIT");
        for (int c = begin; c <= end; c += step)
            System.out.println(c +"\t" + (1.8 * c + 32));
    }
}