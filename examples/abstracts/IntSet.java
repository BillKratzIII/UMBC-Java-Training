package examples.abstracts;
public class IntSet extends DataStructure {
    private int capacity;
    private int data [];

    public IntSet(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
    }
    public boolean addElement(int element){
        boolean unique = true;
        boolean success = false;
        if(size < capacity){
            for(int i = 0; i < size; i++){
                if(data[i] == element){
                    unique = false;
                    break;
                }
            }
            if(unique){
                data[size] = element;
                size++;
                success = true;
            }
        }
        return success;
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
