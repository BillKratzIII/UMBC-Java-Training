package solutions.inheritance.ex2;
public class Planner{
    private SimpleDate sd [];
    private int capacity;
    private int size;

    public Planner(int capacity){
        this.capacity = capacity;
        size = 0;
        sd = new SimpleDate[capacity];
    }

    public int getCapacity(){
        return capacity;
    }

    public int getSize(){
        return size;
    }

    public void addDate(SimpleDate d){
        sd[size++] = d;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer(size * 64);
        for(int i = 0; i < size; i++){
            sb.append(sd[i]);
            sb.append('\n');
        }
        return sb.toString();
    }

    public Appointment [] getAppointments(){
        Appointment a [] = new Appointment [size];
        int count = 0;
        for(int i = 0; i < size; i++){
            if(sd[i] instanceof Appointment){
                a[count] = (Appointment) sd[i];
                count++;
            }
        }
        Appointment result [] = new Appointment[count];
        System.arraycopy(a, 0, result, 0, count);
        return result;
    }

    public Holiday [] getHolidays(){
        Holiday a [] = new Holiday [size];
        int count = 0;
        for(int i = 0; i < size; i++){
            if(sd[i] instanceof Holiday){
                a[count] = (Holiday) sd[i];
                count++;
            }
        }
        Holiday result [] = new Holiday[count];
        System.arraycopy(a, 0, result, 0, count);
        return result;
    }

}