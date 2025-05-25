import java.util.List;
import java.util.ArrayList;

public class User {
    private int typeID;
    private int ID;
    private String username;
    private List<Book> borowedBooks;

    public User(int typeID, int ID, String username){
        borowedBooks = new ArrayList<>();
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
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(Library lib, int BookID){//adds the book to the available list from the lib and removes from the user borrowed list
        for(Book b : borowedBooks){
            if(b.getID() == BookID){
                lib.addNewBook(b.getTitle(), b.getAuthor(), b.getYear(), b.getID(), b.isDirty());
                borowedBooks.remove(b);
                return true;
            }
        }
        return false;
    }
}
