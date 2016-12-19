package examples.ooprogramming;
import java.text.DecimalFormat;
public class DecimalFormatTest {
    public static void main(String args[]) {
        double value1 = 10000/6.0;
        int value2 = 25;
        DecimalFormat dfA = new DecimalFormat(".##");
        DecimalFormat dfB = new DecimalFormat(".00");
        DecimalFormat dfC = new DecimalFormat(".###");
        DecimalFormat dfD = new DecimalFormat("##,###.##");
        DecimalFormat dfE = new DecimalFormat("00,000.##");

        System.out.println(dfA.format(value1));
        System.out.println(dfB.format(value1));
        System.out.println(dfC.format(value1));
        System.out.println(dfD.format(value1));
        System.out.println(dfE.format(value1));

        System.out.println(dfA.format(value2));
        System.out.println(dfB.format(value2));
        System.out.println(dfC.format(value2));
        System.out.println(dfD.format(value2));
        System.out.println(dfE.format(value2));

    }
}