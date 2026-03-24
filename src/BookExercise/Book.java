package BookExercise;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is already borrowed!");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed!");
        }
    }

    public void display(){
        System.out.print("Book title: " + title + ", Book Author: " + author + ", Book Year: " + year + "Availability: " + available);
    }
}
