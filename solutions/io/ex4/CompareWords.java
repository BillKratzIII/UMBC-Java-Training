package solutions.io.ex4;

import java.io.*;
import java.util.*;

public class CompareWords {
    public static void main(String args[]) throws IOException {
        if (args.length != 2) {
            System.out.println("Please specify 2 files on command line");
            System.exit(1);
        }
        File f1 = new File(args[0]);
        if (!f1.exists()) {
            System.out.println(args[0] + " does not exist");
            System.exit(2);
        }            
        File f2 = new File(args[1]);
        if (!f2.exists()) {
            System.out.println(args[1] + " does not exist");
            System.exit(3);
        }

        String words1[] = getWordList(f1);
        String words2[] = getWordList(f2);

        System.out.println ("Words common to both files:");
        for (int i1 = 0; i1 < words1.length; ++i1) {
            for (int i2 = 0; i2 < words2.length; ++i2) {
                if (words1[i1].equalsIgnoreCase(words2[i2])) {
                    System.out.println(words1[i1]);
                    break;
                }
            }
        }
    }

    
    public static String[] getWordList(File inputFile) throws IOException {
        String theLine, theWord;
        String temp[] = new String[500];   // assume 500 words max.
        int index = 0;
        boolean dupFound;
        StringTokenizer st;
        
        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);

        while((theLine = br.readLine()) != null) {
            st = new StringTokenizer(theLine);
            while (st.hasMoreTokens()) {
                theWord = st.nextToken();

                // check for duplicates

                dupFound = false;
                for (int i = 0; i < index; ++i) {
                    if (theWord.equalsIgnoreCase(temp[i])) {
                        dupFound = true;
                        break;
                    }
                }

                if (!dupFound) {
                    temp[index] = theWord;
                    index++;
                }
            }
        }
        br.close();
                
        // return an array of the unique words

        String[] wordList = new String[index];
        System.arraycopy (temp, 0, wordList, 0, index);
        return wordList;
    }
}
