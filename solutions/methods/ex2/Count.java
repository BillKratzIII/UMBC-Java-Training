package solutions.methods.ex2;
public class Count {
    public static int digits(String p) {
        int digits = 0;
        for (int i = 0; i < p.length(); i++) {
            if ( Character.isDigit(p.charAt(i)) )
                digits++;
        }
        return digits;
    }

    public static int digits(StringBuffer p) {
        return digits(p.toString());
    }

    public static int whitespace(String p) {
        int digits = 0;
        for (int i = 0; i < p.length(); i++) {
            if ( Character.isWhitespace(p.charAt(i)) )
                digits++;
        }
        return digits;
    }

    public static int whitespace(StringBuffer p) {
        return whitespace(p.toString());
    }
}