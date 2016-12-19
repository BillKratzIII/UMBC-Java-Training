package starters.collections.ex2;
import java.io.*;
import java.util.*;
public class StateCaps {
    public static void main(String args[]) {
        HashMap caps = getHash();
        String state, city;
        Set set = caps.keySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            city = (String) iter.next();
            state = (String) caps.get(city);
            System.out.println(city + ", " + state);
        }
    }
    public static HashMap getHash(){
        HashMap caps = new HashMap();
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("statecaps.txt");
            br = new BufferedReader(fr);
            String theLine;
            String state, city;
            while((theLine = br.readLine())!= null){
                int place = theLine.indexOf(',');
                state = theLine.substring(0, place);
                city = theLine.substring(place + 1);
                caps.put(city, state);
            }
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        } finally {
            try{
                fr.close();
                br.close();
            } catch (IOException ioe){
            }
        }
        return caps;
    }
}

