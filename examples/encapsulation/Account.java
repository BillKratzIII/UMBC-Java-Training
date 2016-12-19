package examples.encapsulation;
public class Account {
    private static int counter = 1000;
    private String name;
    private int accountNum;
    public Account(String n) {
        name = n;
        accountNum  = counter++;
    }
    public String toString() {
        return name + " has account # " + accountNum;
    }
    public static int nextNumber() {
        return counter;
    }
}