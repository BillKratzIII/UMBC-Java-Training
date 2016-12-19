package solutions.ooprogramming.ex3;
public class PadTest{
    public static void main(String args[]){
        PaddedString ps1 = new PaddedString("   Sample String   ");
        PaddedString ps2 = new PaddedString(1234);
        PaddedString ps3 = new PaddedString(56.789);
        ps1.trimBlanks();
        System.out.println("|" + ps1 + "|");

        ps1.padLeft(20);
        ps2.padLeft(20);
        ps3.padLeft(20);
        System.out.println("12345678901234567890");
        System.out.println(ps1);
        System.out.println(ps2);
        System.out.println(ps3);

        ps1.replace(76543);
        ps2.replace("Some Data");
        ps3.replace(22.345);

        ps1.padRight(20);
        ps2.padRight(20);
        ps3.padRight(20);
        System.out.println("1234567890123456789012345");
        System.out.println(ps1 + "|");
        System.out.println(ps2 + "|");
        System.out.println(ps3 + "|");
    }
}