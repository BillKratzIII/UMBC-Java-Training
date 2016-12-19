package examples.ooprogramming;
import java.util.StringTokenizer;
public class StringTokenizerTest {
    public static void main(String args[]) {
        String text = "Mon Tue Wed Thu Fri Sat Sun";
        StringTokenizer st;
        st = new StringTokenizer(text);
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("---------------");

        text = "Data,More Data-StillMoreData";
        st = new StringTokenizer(text, ",-");
        int numTokens = st.countTokens();
        for(int i = 0; i < numTokens; i++){
            System.out.println(st.nextToken());
        }
    }
}