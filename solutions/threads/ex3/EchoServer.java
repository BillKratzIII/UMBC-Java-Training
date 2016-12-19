package solutions.threads.ex3;
import java.net.*;
import java.io.*;
public class EchoServer {
    public static void main(String args[]) {
        ServerSocket theServer = null;
        Socket clientSocket;
        int port = 2345;
        InetAddress ia = null;
        // Attempt to start the server
        // bound to the given port
        try{
            theServer = new ServerSocket(port);
            // Print info about the server
            ia = InetAddress.getLocalHost();
            String host = ia.getHostAddress();
            System.out.print("Server started on " +
                host+ "  Listening on port "+ port);
            // loop for each client
            while(true){
                // wait for a client to connect
                clientSocket = theServer.accept();
                // handle client in a helper method
                Thread t = new ClientHandlerThread(clientSocket);
                t.start();
            } // proceed to next Client
        } catch(IOException ioe){
            ioe.printStackTrace();
            System.exit(1);
        }
    }
}