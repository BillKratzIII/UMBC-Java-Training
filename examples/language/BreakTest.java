package examples.language;
public class BreakTest {
    public static void main(String args[]) {
        int i;
        for ( i = 1; i <= 100; i = i + 1){
            if ( i * i > 500 )
                break;
        }
        System.out.println("i is "  + i);
    }
}