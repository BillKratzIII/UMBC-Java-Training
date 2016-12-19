package solutions.language.ex4;
public class Evens {
    public static void main(String args[]) {
        for (int i = 20; i <= 60; i += 2) {
            System.out.println(i + "\t"
                + (i * i) + "\t"
                + (i * i * i));
        }// end for i loop
    }// end main
}