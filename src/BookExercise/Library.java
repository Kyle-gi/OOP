package BookExercise;

import java.util.Scanner;

public class Library {

    private Book[] books;

    public Library(){
        books = new Book[5];
    }

    public void addBook(Book b){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                books[i] = b;
                System.out.println("Book added at position " + i);
                return;
            }

        }
        System.out.println("Library is full, cannot add more books.");
    }

    public void listBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.println("Position " + i + ": " + books[i].toString());
            }
        }
    }

    public void borrowBook(String title){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            
        }
    }
}
