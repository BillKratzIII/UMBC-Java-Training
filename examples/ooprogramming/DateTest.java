package examples.ooprogramming;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String args[]) {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Date now = new Date();
        //System.out.println(now.toString());
        System.out.println(now);
        Calendar calendar = new GregorianCalendar(2016,11,13,16,27);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println();
        
        System.out.print("Day of the Week: ");
        System.out.println(now.getDay());
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        System.out.print("Day of the Month: ");
        System.out.println(now.getDate());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.print("Month: ");
        System.out.println(now.getMonth());
        System.out.println(calendar.get(Calendar.MONTH));

        System.out.print("Year: ");
        System.out.println(now.getYear());
        System.out.println(calendar.get(Calendar.YEAR));

        System.out.print("Time: ");
        System.out.println(now.getTime());
        String formattedTime = calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE);
        System.out.println(formattedTime);
        
    }
}