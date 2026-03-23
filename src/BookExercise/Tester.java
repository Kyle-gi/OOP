package BookExercise;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the book title: ");
        String title = sc.nextLine();
        System.out.print("Insert the authors name of the book: ");
        String author = sc.nextLine();
        System.out.print("Year that it was published: ");
        int year = sc.nextInt();
        System.out.println("Is it available? ");
        boolean available = sc.hasNext();

        Book b = new Book(title, author, year, available);
        b.display();
    }
}
