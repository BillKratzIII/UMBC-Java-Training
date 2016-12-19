package solutions.collections.ex2;
import java.io.*;
import java.util.*;
public class StateCaps {
    public static void main(String args[]) throws IOException {
        HashMap caps = getHash();
        String state, city;
        Set set = caps.keySet();
        ArrayList keys = new ArrayList(set);
        int loop = 5;
        int correct = 0;
        if (args.length == 1)
            loop = Integer.parseInt(args[0]);
        BufferedReader kbr = new BufferedReader(new InputStreamReader(System.in));
        String answer = null;
        for(int i = 0; i < loop; i++){
            int r = (int) (Math.random() * 50);
            city = (String) keys.get(r);
            state = (String) caps.get(city);
            System.out.print("What is the capital of ");
            System.out.println(state + " ?");
            answer = kbr.readLine();
            if(answer.equals(city)){
                System.out.println("Correct");
                correct++;
            }
            else{
                System.out.println("Incorrect:");
                System.out.println("The answer is: " + city);
            }
        }
        System.out.print("You got " + correct + "out of ");
        System.out.println(loop + " correct");
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

