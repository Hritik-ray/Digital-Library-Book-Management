# Digital Library Book Management System

This application allows librarians to efficiently manage books by adding, updating, searching, and deleting book records while maintaining their availability status.

##  Features
 **Add a Book** – 
 
 ->Store book details (ID, Title, Author, Genre, Availability). 

 **View All Books** – 
 
 ->Display a list of all available books. 
 
 **Search a Book** – 
 
 ->Search by Book ID or Title.  
 
 **Update Book Details** – 
 
 ->Modify details like title, author, or availability status.  
 
 **Delete a Book** –
 
 ->Remove a book from the catalog.
 
 **Exit System** – 
 
 ->Close the program safely. 
 

 
##  Constraints
-> **Book ID** must be unique.  
-> **Title & Author** cannot be empty.  
-> **Availability Status** must be either **Available** or **Checked Out**.  


## Folder Structure
  
│-- 📁 src        ( Java source files (.java) )

│   ├── 📄 Book.java  

│   ├── 📄 Library.java  

│   ├── 📄 Main.java

│-- 📄 library_data.txt  ( Stored book data )

│-- 📁 bin        (Compiled class files (.class) )

│-- 📄 README.md  (Project documentation)


##  Setup & Run Instructions


1. **Clone the Repository**  
   
     git clone https://github.com/Hritik-ray/Digital-Library-Book-Management.git

  

 2. **Run using an IDE**
 
     ->Open the project in VS Code / IntelliJ IDEA / Eclipse.

     ->Set src as the source folder and bin as the output folder.

     ->Run the Main.java file.

   


## Challenges Faced
->Ensuring correct file structure (src for .java files, bin for .class files).

->Implementing search functionality efficiently.

->Handling user input validation and data persistence.



## Future Improvements
->Adding a Graphical User Interface (GUI) for better usability.

->Implementing a database for persistent book storage.

->Improving exception handling for robustness.









