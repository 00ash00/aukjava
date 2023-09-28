package Project11;
import java.util.Arrays;
import java.util.Scanner;


public class project11_dialog {

    public static class Book_Class { //book class
        private String title;
        private String author;
        private int year;

        public Book_Class(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
        //get set
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public String toString() { // info about book
            return "\n Book List: " + "\n Title: " + title +
                    "\n by " + author + "\n Year: " + year + "\n" ;
        }
    }

    public static class BookCollection { // book collection
        private Book_Class[] books;
        private int size;

        public BookCollection() {
            this.books = new Book_Class[10];
            this.size = 0;
        }

        public void addBook(Book_Class book) {
            if (size == books.length) {
                books = Arrays.copyOf(books, size + 1);
            }
            books[size++] = book;
        }

        public void removeBook(int index) {
            if (index >= 0 && index < size) {
                for (int i = index; i < size - 1; i++) {
                    books[i] = books[i + 1];
                }
                size--;
            }
        }

        public Book_Class[] getBooks() {
            return Arrays.copyOf(books, size);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCollection collection = new BookCollection();
        int choice;

        do {
            System.out.println("Welcome to the book database!");
            System.out.println("Choose an option to proceed:");
            System.out.println("_______________________");
            System.out.println("1 - print book list");
            System.out.println("2 - add new book");
            System.out.println("3 - remove book");
            System.out.println("0 - exit the program");
            System.out.println("_______________________");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    for (Book_Class book : collection.getBooks()) {
                        System.out.println(book);
                    }
                    break;
                case 2:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    collection.addBook(new Book_Class(title, author, year));
                    break;
                case 3:
                    System.out.print("Enter the index of the book you want to delete: ");
                    int index = scanner.nextInt();
                    collection.removeBook(index);
                    break;
                case 0:
                    System.out.println("///Exit///");
                    break;
                default:
                    System.out.println("Error");
            }
        } while (choice != 0);
    }
}
