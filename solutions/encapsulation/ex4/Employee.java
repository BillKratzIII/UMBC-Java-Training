package solutions.encapsulation.ex4;
public class Employee {
    // instance data
    private String name;
    private String id;
    private SimpleDate hireDate;

    // static data
    private static IDGenerator idg
        = new IDGenerator("emp", 1);

    // constructors
    public Employee (String name, SimpleDate hd){
        this.name = name;
        hireDate = hd;
        id = idg.issueNext();
    }

    // methods
    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public SimpleDate getHireDate() {
        return hireDate;
    }

    public String toString() {
        return name + ", " + id + ", " + hireDate;
    }
}