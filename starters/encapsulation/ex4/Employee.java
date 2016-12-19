package starters.encapsulation.ex4;
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
        // **** TODO ***
    }

    // methods
    public String getName() {
        // **** TODO ***
        return null;
    }

    public String getID() {
        // **** TODO ***
        return null;
    }

    public SimpleDate getHireDate() {
        // **** TODO ***
        return null;
    }

    public String toString() {
        // **** TODO ***
        return null;
    }
}