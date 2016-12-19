package examples.language;
public class NestedBreakTest {
    public static void main(String args[]) {
        int i,j;
outer:  for (i = 0; i < 10; i++)
           for ( j = 0; j < 10; j++)
              if ( i + j > 15 )
                 break outer;
        System.out.println("i is "  + i);
    }
}