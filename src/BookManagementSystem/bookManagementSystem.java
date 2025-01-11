package BookManagementSystem;

import java.util.Scanner;

public class bookManagementSystem {
    public static void main(String[] args) {
        int bookID, inp = 0;
        String title, author;

        Scanner scan = new Scanner(System.in);

        Library library = new Library();

        Book Ikigai = new Book(911, "Ikigai!", "Hector Garcia", true);
        Book Shiva = new Book(198, "The Immortals of Meluha!", "Amish", true);
        Book Kama = new Book(111, "Kama: The riddle of desire!", "Gurucharan Das", true);
        Book theAlchemist = new Book(112, "The Alchemist", "Paulo Coelho", true);
        Book mye = new Book(131, "Master your emotions!", "Thibaut Meurisse", true);

        library.addBook(Ikigai);
        library.addBook(Shiva);
        library.addBook(Kama);
        library.addBook(theAlchemist);
        library.addBook(mye);


        while (inp != 7) {
            //implement a menu-driven user interface to interact with the library system
            //Allow users to add, replace and display books
            library.displayMenu();

            inp = scan.nextInt();

            if (inp == 1) {
                library.displayBooks();
            }

            if (inp == 2) {
                System.out.println("Enter a Book ID: ");
                bookID = scan.nextInt();

                System.out.println("Enter the title of book: ");
                title = scan.nextLine();

                System.out.println("Enter the name of the author of the book: ");
                author = scan.nextLine();

                Book b1 = new Book(bookID, title, author, true);

                library.addBook(b1);
                library.displayBooks();
            }

            if (inp == 3) {
                System.out.println("Enter the Book ID of the book you want to replace with: ");
                bookID = scan.nextInt();
                scan.nextLine();

                System.out.println("Enter the title of book: ");
                title = scan.nextLine();

                System.out.println("Enter the name of the author of the book: ");
                author = scan.nextLine();

                Book b1 = new Book(bookID, title, author, true);

                library.replaceBook(bookID, b1);
                library.displayBooks();
            }

        }
    }
}
