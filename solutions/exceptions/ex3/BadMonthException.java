package solutions.exceptions.ex3;
public class BadMonthException extends Exception{
    private int badMonth;
    public BadMonthException(String msg, int badMonth){
        super(msg);
        this.badMonth = badMonth;
    }
    public int getBadMonth(){
        return badMonth;
    }
    public String toString(){
        return super.toString() + ":" + badMonth;
    }
}