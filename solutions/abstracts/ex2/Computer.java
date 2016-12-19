package solutions.abstracts.ex2;
public class Computer implements Auctionable {
    private String brand, chip;

    /*
     In order to show that the implementation of the
     getDescription and getCondition methods is left
     up to the implementing class -
     This class maintains both as an instance variable
     and allows them to be set via the setDescription
     and setCondition methods.
     It also provides a default description should the
     setDescription method not be called
     */
    private int condition;
    private String description = "No Description Available";

    public Computer (String brand, String chip) {
        this.brand = brand;
        this.chip = chip;
    }
    public String getBrand() { return brand; }
    public String getChip()  { return chip;  }
    public String toString(){
        return brand + " " + chip;
    }
    public void setDescription(String s){
        description = s;
    }
    public String getDescription() {
        return description;
    }
    public void setCondition(int c){
        condition = c;
    }
    public int getCondition(){
        return condition;
    }

}