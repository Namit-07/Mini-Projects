import java.util.*;

class Book {
    String name;
    String author;
    String issuedTo;
    String issuedOn;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    void issue(String userName, String date) {
        this.issuedTo = userName;
        this.issuedOn = date;
    }

    void returnBook() {
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String toString() {
        return "Book: " + name + " | Author: " + author +
                (issuedTo != null ? " | Issued to: " + issuedTo + " on " + issuedOn : " | Available");
    }
}

public class Library_management_system {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    issueBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    viewBooks();
                    break;
                case 5:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void addBook() {
        System.out.print("Enter book name: ");
        String name = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        books.add(new Book(name, author));
        System.out.println("Book added successfully.");
    }
    static void issueBook() {
        System.out.print("Enter book name to issue: ");
        String name = sc.nextLine();
        for (Book b : books) {
            if (b.name.equalsIgnoreCase(name)) {
                if (b.issuedTo == null) {
                    System.out.print("Enter user name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter issue date (dd-mm-yyyy): ");
                    String date = sc.nextLine();
                    b.issue(user, date);
                    System.out.println("Book issued to " + user);
                    return;
                } else {
                    System.out.println("Book is already issued to " + b.issuedTo);
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    static void returnBook() {
        System.out.print("Enter book name to return: ");
        String name = sc.nextLine();
        for (Book b : books) {
            if (b.name.equalsIgnoreCase(name)) {
                if (b.issuedTo != null) {
                    b.returnBook();
                    System.out.println("Book returned successfully.");
                    return;
                } else {
                    System.out.println("Book is not issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}
