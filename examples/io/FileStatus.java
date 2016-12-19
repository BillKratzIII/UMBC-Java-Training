package examples.io;
import java.io.*;
import java.util.*;
public class FileStatus  {
    public static void main(String args[]) {
        File theFile;
        for( int i = 0; i < args.length; i++) {
            theFile = new File(args[i]);
            if ( theFile.exists() )
                processFile(theFile);
            else {
                print(theFile + "Not a file");
            }
        }
    }
    public static void processFile(File f){
        print("--------------------");
        print(f + " Exists");
        print("Size: " + f.length());
        print("Path: " + f.getAbsolutePath());
        Date d = new Date(f.lastModified());
        print("Last Modified: " + d);
        if ( f.isDirectory() ){
            print("File is a directory");
            print("Files in directory are:");
            String contents [] = f.list();
            for(int i = 0; i < contents.length; i++)
                print("     " + contents[i]);
        }
    }
    public static void print(String s){
        System.out.println(s);
    }
}