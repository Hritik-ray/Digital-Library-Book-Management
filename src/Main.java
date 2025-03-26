import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book Availability");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("\nChoose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookID = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    
                    library.addBook(new Book(bookID, title, author, genre, "Available"));
                    break;
                
                case 2:
                    library.viewBooks();
                    break;
                
                case 3:
                    System.out.print("Enter Book ID or Title to search: ");
                    String searchKey = scanner.nextLine();
                    library.searchBook(searchKey);
                    break;
                
                case 4:
                    System.out.print("Enter Book ID to update availability: ");
                    String updateID = scanner.nextLine();
                    System.out.print("Is the book available? (Yes/No): ");
                    String response = scanner.nextLine();
                    library.updateBookAvailability(updateID, response);
                    break;
                
                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    String deleteID = scanner.nextLine();
                    library.deleteBook(deleteID);
                    break;
                
                case 6:
                    System.out.println("Exiting System...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
