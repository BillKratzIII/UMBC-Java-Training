package starters.threads.ex2;
public class ThreadTest {
    public static void main(String[] args) {
        LetterThread ell;
        String letters = "abcde";
        for ( int i = 0; i < 5; i++)  {
            ell = new LetterThread(letters.charAt(i), i + 5);
            ell.start();
        }
    }
}