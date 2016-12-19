package starters.inheritance.ex2;
public class Appointment extends SimpleDate{
    String place;
    String type;

    // constructors
    public Appointment(int m, int d, int y, String place, String type) {
        super(m, d, y);
        this.place = place;
        this.type = type;
    }

    public Appointment(int m, int d, String place, String type) {
        super(m, d);
        this.place = place;
        this.type = type;
    }

    public Appointment(int d, String place, String type) {
        super(d);
        this.place = place;
        this.type = type;

    }

    public Appointment(String place, String type) {
        super();
        this.place = place;
        this.type = type;
    }

    public Appointment(String date, String place, String type) {
        super(date);
        this.place = place;
        this.type = type;
    }

    //methods
    public String getPlace(){
        return place;
    }
    public String getType(){
        return type;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append(", Place: ");
        sb.append(place);
        sb.append(", Type: ");
        sb.append(type);
        return   sb.toString();
    }
}