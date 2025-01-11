package BookManagementSystem;

public class Book {
    //Attributes
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    //Constructor to initiate book items
    public Book(int bookID, String title, String author, boolean isAvailable){
         this.bookID = bookID;
         this.title = title;
         this.author = author;
         this.isAvailable = isAvailable;
    }

    //Getter & Setter methods for book attributes
    public int getBookID(int bookID) {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
