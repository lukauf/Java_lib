import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        Library library = new Library();

        
        User S_Lucas = library.addNewUser(1, 14591100, "Lucas Kaufmann");
        User T_Coutinho = library.addNewUser(2, 14581100, "Coutinho");

        library.addNewBook("Calculo 1", "Guidorizzi", 2015, 776, false);
        library.addNewBook("Calculo 2", "Guidorizzi", 2015, 777, false);
        library.addNewBook("Calculo 3", "Guidorizzi", 2015, 778, false);
        library.addNewBook("Calculo 4", "Guidorizzi", 2015, 779, false);
        S_Lucas.borrowNewBook(library, 776);
        S_Lucas.searchBook(776).makeDirty();
        S_Lucas.returnBook(library, 776);
        S_Lucas.borrowNewBook(library, 777);
        S_Lucas.borrowNewBook(library, 778);
        S_Lucas.borrowNewBook(library, 779);
        S_Lucas.searchBook(776).makeClean();
        S_Lucas.returnBook(library, 776);

     S_Lucas.borrowNewBook(library, 799);
     T_Coutinho.borrowNewBook(library, 1000);

        
        


    }
}
