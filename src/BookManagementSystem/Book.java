package BookManagementSystem;

public class Book {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookID, String title, String author, boolean isAvailable){
         this.bookID = bookID;
         this.title = title;
         this.author = author;
         this.isAvailable = isAvailable;
    }

    public int getBook(int bookID) {
        return bookID;
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
