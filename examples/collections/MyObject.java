package examples.collections;
public class MyObject implements Cloneable{
    int x = 0;
    public MyObject(int a){
        x = a;
    }
    public Object clone(){
        System.out.println("Inside of Clone");
        return null;
    }
}