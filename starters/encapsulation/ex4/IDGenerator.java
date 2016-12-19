package starters.encapsulation.ex4;
public class IDGenerator{
    private String prefix;
    private int number;

    // supplies a default prefix
    // supplies a default starting number
    public IDGenerator() {
        this("id", 0);
    }

    // user supplies prefix
    // supplies a default starting number
    public IDGenerator(String prefix){
        this(prefix, 0);
    }

    // user supplies prefix
    // user supplies starting number
    public IDGenerator(String prefix, int start){
        this.prefix = prefix;
        number = start;
    }

    // issue an id and increment number
    public String issueNext(){
        return prefix + number++;
    }

    // return id but do not increment
    public String viewNext(){
        return prefix + number;
    }
}