package starters.encapsulation.ex2;
public class SimpleDateTester{
    public static void main(String args[]){
        SimpleDate dates [] = {
		    new SimpleDate(2, 3, 2008),   //DayOfYear:34   DaysLeft:332
		    new SimpleDate(2, 3, 2011),   //DayOfYear:34   DaysLeft:331
		    new SimpleDate(3, 2, 2008),   //DayOfYear:62   DaysLeft:304
		    new SimpleDate(3, 2, 2011),   //DayOfYear:61   DaysLeft:304
		    new SimpleDate(12, 30, 2008), //DayOfYear:365  DaysLeft:1
		    new SimpleDate(12, 30, 2011), //DayOfYear:364  DaysLeft:1
        };
        for(int i = 0; i < dates.length; i++){
            System.out.println(dates[i]);
            System.out.println("Month:     " + dates[i].getMontAsString());
            System.out.println("DayOfYear: " + dates[i].getDayOfYear());
            System.out.println("DaysLeft:  " + dates[i].getDaysLeftInYear());
            System.out.println("Leap Year: " + dates[i].isLeapYear());
            System.out.println();
        }
    }
}