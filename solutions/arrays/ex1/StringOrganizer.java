package solutions.arrays.ex1;
import java.util.Arrays;
public class StringOrganizer {
    // instance variables
    String data [];

    // constructors
    public StringOrganizer (String [] args){
        data = args;
    }

    // instance methods
    public void reverse(){
        String temp;
        int j = data.length - 1;
        for (int i = 0; i < j; i++) {
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            j--;
        }
    }

    public void ascendingSort(){
        Arrays.sort(data);
    }

    public void descendingSort(){
        ascendingSort();
        reverse();
    }

    public String getString(int index){
        return data[index];
    }

    public String toString(){
        StringBuffer sb = new StringBuffer(data.length * 32);
        for(int i = 0; i < data.length; i++){
            sb.append(data[i]);
            sb.append('\n');
        }
        return sb.toString();
    }
}