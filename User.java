import java.util.List;
import java.util.ArrayList;

public class User {
    private int typeID;
    private int ID;
    private String username;
    private List<Book> borowedBooks;

    public User(int typeID, int ID, String username){
        borowedBooks = new ArrayList<>();
        this.ID = ID;
        this.username = username;
    }

    public int getTypeID() {
        return typeID;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public List<Book> getBorowedBooks() {
        return borowedBooks;
    }

    public boolean borrowNewBook(Library lib, int BookID){ //adds the book to user's borrowed list, to library borrowed list
                                                          //and removes from the libs available book list
        for(Book b: lib.getAvailableBooks()){
            if(b.getID() == BookID){
                borowedBooks.add(b);
                lib.addBorrowed(b.getTitle(), b.getAuthor(), b.getYear(), b.getID(), b.isDirty());
                lib.removeBook(BookID);
                System.out.println("Book borrowed by user: " + username + ", Book: " + b.getTitle());
                return true;
            }
        }
        System.out.println("Book with ID " + BookID + " not available for user: " + username);
        return false;
    }

    public boolean returnBook(Library lib, int BookID){//adds the book to the available list from the lib and removes from the user borrowed list
        for(Book b : borowedBooks){
            if(b.getID() == BookID){
                if(b.isDirty()){
                    System.out.println("Could not return book" + b.getTitle() + " because it is dirty");
                    return false;
                }
                lib.addNewBook(b.getTitle(), b.getAuthor(), b.getYear(), b.getID(), b.isDirty());
                borowedBooks.remove(b);
                System.out.println("Book returned by user: " + username + ", Book: " + b.getTitle());
                return true;
            }
        }
        System.out.println("Book with ID " + BookID + " not found in borrowed books for user: " + username);
        return false;
    }
    
    public Book searchBook(int ID){
        for(Book b: borowedBooks){
            if(b.getID() ==  ID){
                System.out.println("Book " + b.getTitle() + " was found");
                return b;
            }
        }
        return null;
   }
}
