package solutions.arrays.ex1;
public class TestStringOrganizer{
    public static void main(String args[]){
        StringOrganizer so = new StringOrganizer(args);
        System.out.println("Original:\n" + so);
        so.reverse();
        System.out.println("Reversed:\n" + so);
        so.ascendingSort();
        System.out.println("Ascending:\n" + so);
        so.descendingSort();
        System.out.println("Descending:\n" + so);
    }

}