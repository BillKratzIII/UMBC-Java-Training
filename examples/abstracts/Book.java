package examples.abstracts;
public class Book {
    private String title, author;
    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() { return title;  }
    public String getAuthor(){ return author; }
    public String toString(){
        return title + " " + author;
    }
}