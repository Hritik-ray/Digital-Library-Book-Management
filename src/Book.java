import java.io.*;

class Book implements Serializable {
    private String bookID;
    private String title;
    private String author; 
    private String genre;
    private String availability;
    
    
    public Book(String bookID, String title, String author, String genre, String availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }
    
    public String getBookID() {
         return bookID; 
    }
    public String getTitle() {
         return title; 
    }
    public String getAuthor() {
         return author; 
    }
    public String getGenre() {
         return genre;
    }
    public String getAvailability() { 
        return availability; 
    }
    
    public void setAvailability(String availability) {
         this.availability = availability;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) { 
        this.author = author; 
    }
    
    @Override
    public String toString() {
        return "BookID: " + bookID +
                 "\nTitle: " + title + 
                 "\nAuthor: " + author + 
                 "\nGenre: " + genre + 
                 "\nAvailability: " + availability;
    }
}
