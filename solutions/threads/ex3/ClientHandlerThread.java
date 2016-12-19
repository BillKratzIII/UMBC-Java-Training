package solutions.threads.ex3;
import java.net.*;
import java.io.*;
public class ClientHandlerThread extends Thread{
    Socket cSocket;
    public ClientHandlerThread(Socket s){
        cSocket = s;
    }
    public void run(){
        PrintStream toClient;
        BufferedReader fromClient;
        String data;
        try{
            // Get Input and Output
            fromClient = new BufferedReader(
                new InputStreamReader(
                    cSocket.getInputStream()));
            toClient = new PrintStream(
                cSocket.getOutputStream());
            while(true){
                // read from Client
                data = fromClient.readLine();
                if(data == null) break;
                data = data.toUpperCase();
                // write to Client
                toClient.println(data);
            }
            fromClient.close();
            toClient.close();
            cSocket.close();
        }catch(IOException ioe){
            String msg = "Connection lost";
            System.out.println(msg);
        }
    }
}