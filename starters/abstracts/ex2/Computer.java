package starters.abstracts.ex2;
public class Computer {
    private String brand, chip;
    public Computer (String brand, String chip) {
        this.brand = brand;
        this.chip = chip;
    }
    public String getBrand() { return brand; }
    public String getChip()  { return chip;  }
    public String toString(){
        return brand + " " + chip;
    }
}