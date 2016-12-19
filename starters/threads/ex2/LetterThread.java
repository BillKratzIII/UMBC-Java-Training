package starters.threads.ex2;
public class LetterThread extends Thread {
    private char letter;
    private int times;
    LetterThread(char letter, int times) {
        this.letter = letter;
        this.times = times;
    }
    public void run() {

        int number = 0;
        for ( int i = 0; i < times; i++) {
            System.out.print(letter);
            try {
                number = (int) (Math.random() * 500 + 250);
                Thread.sleep(number);
            } catch(InterruptedException ie) {
            }
        }
    }
}