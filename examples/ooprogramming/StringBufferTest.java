package examples.ooprogramming;
public class StringBufferTest{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        System.out.print("length:" + sb.length());
        System.out.println(" cap:" + sb.capacity());
        System.out.println();
        sb.append(123456789);
        System.out.println(sb.toString());
        System.out.print("length:" + sb.length());
        System.out.println(" cap:" + sb.capacity());
        System.out.println();
        sb.insert(0, "abcdefghi");
        System.out.println(sb.toString());
        System.out.print("length:" + sb.length());
        System.out.println(" cap:" + sb.capacity());
        System.out.println();
        sb.replace(2, 5, "Hello");
        System.out.println(sb.toString());
        System.out.print("length:" + sb.length());
        System.out.println(" cap:" + sb.capacity());
        System.out.println();
    }
}