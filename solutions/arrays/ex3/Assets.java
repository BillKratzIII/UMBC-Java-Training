package solutions.arrays.ex3;
public class Assets{
    // instance variables
    String names[];
    double values[];
    int size, capacity;

    // constructor
    public Assets(int maxSize){
        names = new String[maxSize];
        values = new double[maxSize];
        capacity = maxSize;
        size = 0;
    }

    // methods

    // add an item and its value to this object
    public void addElement(String item, double itemVal){
        names[size] = item;
        values[size] = itemVal;
        size++;
    }

    // number of items currently stored
    public int size(){
        return size;
    }

    // number of items capable of storing
    public int capacity(){
        return capacity;
    }

    // total dollar value of all assets being tracked
    public double getTotalValue(){
        double value = 0;
        for(int i = 0; i < size; i++){
            value += values[i];
        }
        return value;
    }

    // name and value of a particular item
    public String getItem(int whichItem){
        return names[whichItem] + ", " + values[whichItem];
    }

    // table of item names and values
    public String toString(){
        StringBuffer sb = new StringBuffer(size * 256);
        for(int i = 0; i < size; i++){
            sb.append(getItem(i));
            sb.append('\n');
        }
        return sb.toString();
    }
}