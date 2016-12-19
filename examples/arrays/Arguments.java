package examples.arrays;
public class Arguments {
    public static void main(String args[]) {
        if ( args.length == 0 ){
            System.out.println("Need arguments");
            System.exit(1);
        }
        System.out.println("FORWARD");
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        System.out.println("\nBACKWARD");
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println(args[i]);
    }
}