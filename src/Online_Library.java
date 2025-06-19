class Library {
    String[] books;
    int no_of_books = 0;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
        System.out.println("Welcome to Oxford Library\n");
    }
    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added successfully!!");
    }
    void showAvailableBooks() {
        System.out.println("\nAvailable Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book );
        }
        System.out.println();
    }
    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if (book.equals(this.books[i])){
                System.out.print(book + " has been issued successfully!!\n");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(book + " book is not available");
    }
    void returnBook(String book){
        addBook(book);
        System.out.println("The book has been returned");
    }
}
public class Online_Library {
    public static void main(String[] args) {
        Library Oxford = new Library();
        Oxford.addBook("Dictionary");
        Oxford.addBook("English");
        Oxford.addBook("Maths");
        Oxford.addBook("Science");
        Oxford.showAvailableBooks();
        Oxford.issueBook("Dictionary");
        Oxford.issueBook("English");
        Oxford.showAvailableBooks();
        Oxford.returnBook("Dictionary");
        Oxford.returnBook("English");
        Oxford.showAvailableBooks();

    }
}







