package solutions.abstracts.ex2;
public class Book implements Auctionable{
    private String title, author;

    /*
     In order to show that the implementation of the
     getDescription and getCondition methods is left
     up to the implementing class -
     This class maintains both as an instance variable
     and allows them to be set via the setDescription
     and setCondition methods.
     It also provides a default description should the
     setDescription method not be called
     */
    private int condition;
    private String description = "No Description Available";

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() { return title;  }
    public String getAuthor(){ return author; }
    public String toString(){
        return title + " " + author;
    }
    public void setDescription(String s){
        description = s;
    }
    public String getDescription() {
        return description;
    }
    public void setCondition(int c){
        condition = c;
    }
    public int getCondition(){
        return condition;
    }
}