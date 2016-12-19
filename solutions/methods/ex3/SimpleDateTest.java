package solutions.methods.ex3;
public class SimpleDateTest{
    public static void main(String args[]){
        SimpleDate sd1 = new SimpleDate(12,31,2004);
        SimpleDate sd2 = new SimpleDate(10,31);
        SimpleDate sd3 = new SimpleDate(15);
        SimpleDate sd4 = new SimpleDate();

        SimpleDate sd5 = new SimpleDate("3/17/2005");

        System.out.println(sd1);
        System.out.println(sd2);
        System.out.println(sd3);
        System.out.println(sd4);

        System.out.println(sd5);

        sd1.setMonth(7);
        sd1.setDay(4);
        sd1.setYear(2005);
        System.out.println(sd1);

        System.out.println(sd2.getDay());
        System.out.println(sd2.getMonth());
        System.out.println(sd2.getYear());
    }
}