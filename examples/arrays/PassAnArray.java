package examples.arrays;
public class PassAnArray {
    public static void main(String args[]) {
        int [] x = { 1, 2, 3, 4, 5};
        print(x);
        multiply(x, 3);
        print(x);
    }
    public static void multiply(int [] p, int val){
        for(int i = 0; i < p.length; i++)
            p[i] *= val;
    }
    public static void print(int [] p) {
        for(int i = 0; i < p.length; i++)
            System.out.print(p[i] + " ");
        System.out.println();
    }
}