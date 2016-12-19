package examples.language;
public class SwitchTest {
    public static void main(String args[]) {
        int i = 5;
        System.out.print(i + " is: ");
        switch(i) {
            case 0:
                System.out.print("very ");
            case 1:
            case 2:
                System.out.println("small");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("bigger");
                break;
            case 6:
            case 7:
                System.out.println("large");
                break;
            default:
                System.out.println("biggest");
        } // end of switch
    }
}