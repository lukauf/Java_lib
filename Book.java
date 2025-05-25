public class Book {
    private String title;
    private String author_name;
    private int year; 
    private int ID;
    private boolean dirty;
    private boolean borrowed;
    private int borrowedById = -1; // -1 indica que não está emprestado
    
    public Book(String title, String author_name, int year, int ID, boolean dirty){ //constructor is used when we instantiate a class
        this.title = title;//"this" sinalizes that we are refering to the class atribute 
        this.author_name = author_name;//without "this" we are refering to the constructor local parameter 
        this.year = year;
        this.ID = ID;
        this.dirty = dirty;
    }
   
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author_name;
    }
    
    public int getYear(){
        return year;
    }

    public int getID(){
        return ID;
    }
    
    public boolean isDirty(){
        return dirty;
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void makeDirty(){
        this.dirty = true;
        System.err.println("Book" + title +" ID:" + ID + " is dirty");
    }

    public void makeClean(){
        this.dirty = false;
        System.err.println("Book" + title +" ID:" + ID + " is clean");
    }

    public void borrow(int alunoId){
        this.borrowed = true;
        this.borrowedById = alunoId;
        System.err.println("Book " + title + " ID:" + ID + " is borrowed by student ID: " + alunoId);
    }

    public void returned(int alunoId){
        this.borrowed = true;
        this.borrowedById = alunoId;
        System.err.println("Book " + title + " ID:" + ID + " is returned by student ID: " + alunoId);
    }

    public int getBorrowedById() {
        return borrowedById;
    }

    public void setTitle(){

    }
}
