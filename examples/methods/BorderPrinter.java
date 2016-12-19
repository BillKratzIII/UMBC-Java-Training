package examples.methods;
public class BorderPrinter {
    public static void main(String args[]){
        String s = "Border Printer";
        BorderPrinter.boxIt(s);
        s = "Place a border around this also";
        boxIt(s);
    }

    public static void boxIt(String data){
        int len = data.length();
        for(int i = 0; i < len + 4; i++){
            System.out.print('*');
        }
        System.out.println();
        System.out.println("* " + data + " *");
        for(int i = 0; i < len + 4; i++){
            System.out.print('*');
        }
        System.out.println('\n');
    }
}