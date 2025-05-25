import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;
    private List<User> libUsers;

    public Library(){
        availableBooks = new ArrayList<>();//creates lists using the libs
        borrowedBooks = new ArrayList<>();
        libUsers = new ArrayList<>();
    }
    
    public Book searchBook(int ID){
        for(Book b: availableBooks){
            if(b.getID() ==  ID){
                System.out.println("Book " + b.getTitle() + " was found");
                return b;
            }
            
        }
        System.out.println("Book with ID: " + ID + " was not found");
        return null;
    }
    public List<Book> getAvailableBooks(){
        return availableBooks;
    }
    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public List<User> getUsersList(){
        return libUsers;
    }

    public User addNewUser(int typeID, int ID, String username){
        User newUser;
        if (typeID == 1) {
            newUser = new Student(typeID, ID, username);
            System.out.println("Student " + username + " was added");
        } else if (typeID == 2) {
            newUser = new Teacher(typeID, ID, username);
            System.out.println("Teacher " + username + " was added");
        } else {
            newUser = new User(typeID, ID, username);
            System.out.println("User " + username + " was added");
        }
        libUsers.add(newUser);
        return newUser;
        
    }

    public void addNewBook(String title, String author_name, int year, int ID, boolean dirty){
        Book newbook = new Book(title, author_name, year, ID, dirty);
        availableBooks.add(newbook);
        System.out.println("Book '" + title + "' was added to available books.");
    }

    public void addBorrowed(String title, String author_name, int year, int ID, boolean dirty){
        Book newbook = new Book(title, author_name, year, ID, dirty);
        borrowedBooks.add(newbook);
        System.out.println("Book '" + title + "' was added to borrowed books.");
    }

    public void removeBook(int ID){//removes book based on the ID of the book
        Book booktoremove = null;
        for(Book b : availableBooks){
            if (b.getID() == ID){
                booktoremove = b;
                break;
            } 
        }
        if(booktoremove != null){
            availableBooks.remove(booktoremove);
        }
    }
}
