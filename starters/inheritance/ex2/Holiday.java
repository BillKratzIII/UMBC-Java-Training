package starters.inheritance.ex2;
public class Holiday extends SimpleDate{
    String name;

    // constructors
    public Holiday(int m, int d, int y, String name) {
        super(m, d, y);
        this.name = name;
    }

    public Holiday(int m, int d, String name) {
        super(m, d);
        this.name = name;

    }

    public Holiday(int d, String name) {
        super(d);
        this.name = name;
    }

    public Holiday( String name) {
        super();
        this.name = name;
    }

    public Holiday(String date,  String name) {
        super(date);
        this.name = name;
    }

    //methods
    public String getName(){
        return name;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append(", Name: ");
        sb.append(name);
        return   sb.toString();
    }
}