
public class Student extends User{
    public Student(int typeID, int ID, String username){
        super(typeID, ID, username);//calls the user(mother) constructor
    }

    @Override
    public boolean borrowNewBook(Library lib, int BookID){
        if(getBorowedBooks().size() >= 3){
            System.out.println("Book loan limit reached for " + getUsername() + " ID: " + getID());
            return false;
        }
        return super.borrowNewBook(lib, BookID);
    }
}