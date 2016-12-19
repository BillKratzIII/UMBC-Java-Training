package starters.exceptions.ex3;
import java.util.Date;
import java.util.StringTokenizer;
public class SimpleDate {
    int month, day, year;

    private static int months[] = {31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31};

    private static String names[] =
        {"January", "February", "March", "April", "May",
         "June", "July", "August", "September", "October",
         "November", "December"};

    // constructors
    public SimpleDate(int m, int d, int y) {
        checkMonth(m);
        month = m;
        day = d;
        year = y;
    }

    public SimpleDate(int m, int d) {
        checkMonth(m);
        month = m;
        day = d;

        // need to utilize Sun's Date class to obtain
        // current year but we will store it as a 4 digit year
        Date now  = new Date();
        year = now.getYear() + 1900;
    }

    public SimpleDate(int d) {
        day = d;

        // need to utilize Sun's Date class to obtain
        // current year but we will store it as a 4 digit year
        // and current month but we will store Jan as 1 not 0
        Date now = new Date();
        year = now.getYear() + 1900;
        month = now.getMonth() + 1;
    }

    public SimpleDate() {
        // need to utilize Sun's Date class to obtain
        // current year but we will store it as a 4 digit year
        // and current month but we will store Jan as 1 not 0
        // and day of month that we will store as-is

        Date now = new Date();
        year = now.getYear() + 1900;
        month = now.getMonth() + 1;
        day = now.getDate();
    }

    public SimpleDate(String date) {
        StringTokenizer st = new StringTokenizer(date, "/");
        month = Integer.parseInt(st.nextToken());
        checkMonth(month);
        day = Integer.parseInt(st.nextToken());
        year = Integer.parseInt(st.nextToken());
    }

    //methods
    public int getDay()   { return day; }
    public int getMonth() { return month; }
    public int getYear()  { return year;  }

    public void setDay(int d)   { day = d; }
    public void setMonth(int m) {
        checkMonth(m);
        month = m;
    }
    public void setYear(int y)  { year = y; }

    public String toString() {
        return  month + "/" + day + "/" + year;
    }

    public boolean isLeapYear() {
        if(year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        else
            return false;
    }

    public String getMonthAsString() {
        return names[month -1];
    }

    public int getDayOfYear() {
        int sum = 0;
        for (int i = 0; i < month - 1; i++)
            sum += months[i];
        return sum + day;
    }

    public int getDaysLeftInYear() {
        int days = 365;
        if (isLeapYear())
            days = 366;
        return days - getDayOfYear();
    }
    private void checkMonth(int m){
        if(m < 1 || m > 12)
            throw new BadMonthException("Invalid Month", m);
    }
}