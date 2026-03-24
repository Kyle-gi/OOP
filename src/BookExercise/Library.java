package BookExercise;

public class Library {

    private Book[] books;

    public Library() {
        books = new Book[5];
    }

    public void addBook(Book b){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
            }
            System.out.print("The book " + b.getTitle() + " has been added to the library.");
            return;
        }
        System.out.println("Library is already full cannot add: " + b.getTitle());
    }
}
