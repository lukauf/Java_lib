import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;

    public Library(){
        availableBooks = new ArrayList<>();//creates lists using the libs
        borrowedBooks = new ArrayList<>();
    }
    
    public List<Book> getAvailableBooks(){
        return availableBooks;
    }
    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public void addNewBook(String title, String author_name, int year, int ID, boolean dirty){
        Book newbook = new Book(title, author_name, year, ID, dirty); //creates a new object to store at the list
        availableBooks.add(newbook);
    }

    public void addBorrowed(String title, String author_name, int year, int ID, boolean dirty){
        Book newbook = new Book(title, author_name, year, ID, dirty); //creates a new object to store at the list
        borrowedBooks.add(newbook);
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
