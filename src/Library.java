import java.io.*;
import java.util.*;

class Library {
    private List<Book> books;
    private final String FILE_NAME = "library_data.txt";
    
    public Library() {
        loadBooks();
    }
    
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getBookID().equals(book.getBookID())) {
                System.out.println("Book ID must be unique!");
                return;
            }
        }
        books.add(book);
        saveBooks();
    }
    
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    public void searchBook(String key) {
        for (Book book : books) {
            if (book.getBookID().equalsIgnoreCase(key) || book.getTitle().equalsIgnoreCase(key)) {
                System.out.println("Book Found:\n" + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }
    
    public void updateBookAvailability(String bookID, String response) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                if (response.equalsIgnoreCase("yes")) {
                    book.setAvailability("Available");
                } else if (response.equalsIgnoreCase("no")) {
                    book.setAvailability("Checked Out");
                } else {
                    System.out.println("Invalid Input! Please enter Yes or No.");
                    return;
                }
                saveBooks();
                System.out.println("Book availability updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
    
    public void deleteBook(String bookID) {
        books.removeIf(book -> book.getBookID().equals(bookID));
        saveBooks();
        System.out.println("Book deleted successfully.");
    }
    
    private void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }
    private void loadBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            books = (ArrayList<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            books = new ArrayList<>();
        }
    }
}
