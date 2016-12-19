package solutions.ooprogramming.ex3;
public class PaddedString {
    StringBuffer data;

    // constructors
    public PaddedString(String param) {
        data = new StringBuffer(param);
    }

    public PaddedString(double param) {
        data = new StringBuffer("" + param);
    }

    public PaddedString(int param) {
        data = new StringBuffer("" + param);
    }

    // methods
    public void trimBlanks() {
        // removes leading and trailing whitespace

        // first remove any spaces at the beginning
        while(data.charAt(0) == ' ')
                data.deleteCharAt(0);
        // in order to remove spaces at the end
        // we will reverse the contents putting
        // the spaces at the beginning
        // then perform same operation as above
        // then reverse it again to put it back
        data.reverse();
        while(data.charAt(0) == ' ')
                data.deleteCharAt(0);
        data.reverse();
    }

    public void padLeft(int width) {
        int pad = width - data.length();
        for(int i = 0; i < pad; i++)
            data.insert(0, ' ');
    }
    public void padRight(int width){
        int pad = width - data.length();
        for(int i = 0; i < pad; i++)
            data.append(' ');
    }

    public void replace(String param) {
        data.replace(0, data.length(), param);
    }

    public void replace(double param) {
        data.replace(0, data.length(), "" + param);
    }

    public void replace(int param) {
        data.replace(0, data.length(), "" + param);
    }

    public String toString()
    {
        return data.toString();
    }
    public int length() {
        return data.length();
    }
}