package solutions.inheritance.ex1;
public class SimpleDateTester{
    public static void main(String args[]){
        Holiday sd1 = new Holiday(12,31, "New Years Eve");
        System.out.println(sd1);
        Appointment sd2 = new Appointment(2,5, "Baltimore", "Interview");
        System.out.println(sd2);
        // Since a Holiday is a SimpleDate
        // a Holiday can be stored in a reference to a SimpleDate
        SimpleDate sd3 = new Holiday(1, 1, 2004, "New Years");
        System.out.println(sd3);
    }
}