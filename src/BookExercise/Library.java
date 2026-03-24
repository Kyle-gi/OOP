package BookExercise;

import java.util.Scanner;

public class Library {

    private Book[] books;

    public Library() {
        books = new Book[5];
    }

    public void addBook(Book b){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                System.out.print("The book " + b.getTitle() + " has been added to the library.");
                return;
            }
        }
        System.out.println("Library is already full cannot add: " + b.getTitle());
    }

    public void listBooks(){
        boolean hasBooks = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.println(books[i].getTitle() + " ");
                hasBooks = true;
            }
        }
        if (!hasBooks) {
            System.out.print("There are no books!");
        }

    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)){
                books[i].borrowBook();
                return;
            }
        }
        System.out.println("Book is not found: " + title);
    }
    
    public void returnBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)){
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book is not found: " + title);
    }
}
