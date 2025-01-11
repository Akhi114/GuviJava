package BookManagementSystem;

public class Library{
    public Book[] books;
    public int counter;

    public Library () {
        this.books = new Book[5];
        counter = 0;
    }

    //method to add a book to the library
    public void addBook(Book book) {
        if (counter < books.length) {
            books[counter] = book;
            counter++;
        } else {
            System.out.println("\nLibrary is full, you cannot add anymore books!\n But you can replace one!");
            System.out.println("------------------------------------------------");
        }
    }

    //method to replace a book from the library
    public void replaceBook(int bookID, Book book) {
        for (int i=0; i<books.length; i++) {
            if (books[i].getBookID() == bookID){
                books[i] = book;
                break;
            }
            else if (i == 5){
                System.out.println("BookID is incorrect!");
            }
        }
    }

    //method to display all the books in the library
    public void displayBooks() {
        System.out.println("\nBooks can be selected by their IDs!");
        for (int i=0; i< books.length; i++) {
            System.out.print(books[i].getBookID() + ": " + books[i].getTitle() + "\n\t");
            System.out.println(" Written by "+books[i].getAuthor());
            System.out.println("---------------------------------------------------------");
        }
    }

    public void displayMenu() {
        System.out.println("\n To interact with books library!");
        System.out.println("[1] - Display all the books in the library!");
        System.out.println("[2] - Add new books in the library!");
        System.out.println("[3] - Replace books in the library!");
        System.out.println("[7] - To exit the library!");
    }
}
