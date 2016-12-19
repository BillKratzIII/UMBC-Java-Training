package examples.abstracts;
public class IntList extends DataStructure {
    private int capacity;
    private int data [];

    public IntList(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
    }

    public boolean addElement(int element){
        if(size < capacity){
            data[size] = element;
            size++;
            return true;
        }
        else
            return false;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < size; i++){
            sb.append(data[i]);
            if(i < size -1)
                sb.append(", ");
        }
        return sb.toString();
    }
}