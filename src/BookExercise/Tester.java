package BookExercise;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int option;
        do {
            System.out.println("===SELECT AN OPTION===");
            System.out.println("1. Add book");
            System.out.println("2. List all books");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("0. Exit");
            option = sc.nextInt();
            sc.nextLine();


            switch (option) {
                case 1:


                    System.out.print("Insert the title of book: ");
                    String title = sc.nextLine();

                    System.out.print("Insert the name of author: ");
                    String author = sc.nextLine();

                    System.out.print("Insert the year that it was published: ");
                    int year = sc.nextInt();
                    sc.nextLine();


                    System.out.print("Is it available? ");
                    boolean available = sc.nextBoolean();
                    sc.nextLine();

                    Book b = new Book(title, author, year, available);
                    library.addBook(b);
                    break;

                case 2:
                    library.listBooks();
                    break;

                case 3:

                    System.out.println("Insert which book you want to borrow: ");
                    title = sc.nextLine();
                    library.borrowBook(title);
                    break;

                case 4:
                    System.out.println("Insert which book you want to return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 0) ;
        sc.close();
    }
}
