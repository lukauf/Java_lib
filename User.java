import java.util.List;
import java.util.ArrayList;

public class User {
    private int typeID;
    private int ID;
    private String username;
    private List<Book> borowedBooks;

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
}
