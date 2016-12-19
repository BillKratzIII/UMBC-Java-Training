package solutions.io.ex3;

import java.io.*;

public class FileUtility {

    private static BufferedReader br = null;
    
    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String fileName = getFileName("file name");

        File f = new File(fileName);
        if (! f.exists()) {
            System.out.println(fileName + " does not exist");
            System.exit(1);
        }
        if (f.isDirectory()) {
            System.out.println(fileName + " is a directory");
            System.exit(2);
        }

        if (confirm("delete", fileName)) {
            f.delete();
            System.out.println(fileName + " deleted");
            return;
        }
        
        if (confirm("rename", fileName)) {
            String newName = getFileName("new name");
            f.renameTo(new File(newName));
            System.out.println(fileName + " renamed to " + newName);
            return;
        }

        if (confirm("backup", fileName)) {
            String backupName = getFileName("name of backup file");
            copyFile(fileName, backupName);
            System.out.println(fileName + " copied to " + backupName);
            return;
        }        
    }
    
    private static String getFileName(String prompt) throws IOException {
        System.out.print("Enter " + prompt + ": ");
        return(br.readLine());
    }

    private static boolean confirm(String action, String name) throws IOException {
        System.out.print("Do you want to " + action + " " + name + "? (y/n) ");
        String answer = br.readLine();

        if (answer.startsWith("Y") || answer.startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private static void copyFile(String inputFileName, String outputFileName)
        throws IOException {
            
        int aChar;
        
        FileReader fr = new FileReader(inputFileName);
        FileWriter fw = new FileWriter(outputFileName);

        while((aChar =  fr.read()) != -1) {
            fw.write(aChar);
        } 

        fr.close();
        fw.close();
    }    
}
