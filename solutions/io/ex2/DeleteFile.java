package solutions.io.ex2;

import java.io.*;

public class DeleteFile {

    private static BufferedReader br = null;
    
    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter file name: ");

        String fileName = br.readLine();

        File f = new File(fileName);
        if (! f.exists()) {
            System.out.println(fileName + " does not exist");
            System.exit(1);
        }
        if (f.isDirectory()) {
            System.out.println(fileName + " is a directory");
            System.exit(2);
        }

        if (confirmDelete(fileName)) {
            f.delete();
            System.out.println(fileName + " deleted");
        } 
    }

    private static boolean confirmDelete(String name) throws IOException {
        System.out.print("Do you want to delete " + name + "? (y/n) ");
        String answer = br.readLine();

        if (answer.startsWith("Y") || answer.startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
}
