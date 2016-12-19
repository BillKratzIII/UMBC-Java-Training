package solutions.ooprogramming.ex1;
public class StripVowels {
    public static void main(String args[]) {
        String input = new String("Now is the time");
        StringBuffer output = new StringBuffer();

        // work with a copy of the String to allow
        // testing of just the lower case vowels
        // while maintaining origianl characters
        String data = input.toLowerCase();
        for (int i = 0; i < data.length(); i++)  {
            char p = data.charAt(i);
            if (! ( p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u'))
                output.append(input.charAt(i));
        }
        // Print the results
        System.out.println(output);
    }
}