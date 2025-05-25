public class Teacher extends User {
    public Teacher(int typeID, int ID, String username){
        super(typeID, ID, username); // calls the User (superclass) constructor
    }

    @Override
    public boolean borrowNewBook(Library lib, int BookID){
        if(getBorowedBooks().size() >= 5){
            System.out.println("Book loan limit reached for " + getUsername() + " ID: " + getID());
            return false;
        }
        return super.borrowNewBook(lib, BookID);
    }
    
}
