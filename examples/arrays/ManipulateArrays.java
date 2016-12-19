package examples.arrays;
import java.util.Arrays;
public class ManipulateArrays {
    public static void main(String args[]){
        int x [] = {3, 7, 1, 9, 2, 10};
        String s [] = {"Mike", "Alan", "Susan"};
        printArray(x);
        printArray(s);
        System.out.println("\nSorted Order");
        Arrays.sort(x);
        Arrays.sort(s);
        printArray(x);
        printArray(s);
        System.out.print("Filling an array:    ");
        Arrays.fill(s, "NotUsed");
        printArray(s);
    }
    public static void printArray(int a[]){
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void printArray(String s[]){
        for(int i = 0; i < s.length; i++)
            System.out.print(s[i] + " ");
        System.out.println();
    }
}