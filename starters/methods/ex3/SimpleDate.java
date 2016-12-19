package starters.methods.ex3;
import java.util.Date;
public class SimpleDate {
    int month, day, year;

    // constructors
    public SimpleDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public SimpleDate(int m, int d) {
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

    //methods
    public int getDay()   { return day; }
    public int getMonth() { return month; }
    public int getYear()  { return year;  }

    public void setDay(int d)   { day = d; }
    public void setMonth(int m) { month = m; }
    public void setYear(int y)  { year = y; }

    public String toString() {
        return  month + "/" + day + "/" + year;
    }
}