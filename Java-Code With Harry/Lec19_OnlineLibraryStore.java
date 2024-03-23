import java.util.*;

class Library{
    private String[] storedBooks = new String[10];
    private String[] issuedBooks = new String[10];
    private int size1;
    private int size2;
    public Library(){
        System.out.println("Welcome to Online Library");
        size1 = 0;
        size2 = 0;
    }

    public void addBook(){
        System.out.println("Enter book name : ");
        storedBooks[size1] = new Scanner(System.in).next();
        size1++;
    }

    public void setIssuedBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book name : ");
        issuedBooks[size2] = sc.next();
        size2++;

    }

    public void getBooks(){
        if (storedBooks.length < 0){
            System.out.println("No books found!");
        }else {
            for (int i = 0; i < size1; i++) {
                System.out.println("Book "+(i+1) + storedBooks[i]);
            }
        }

    }

    public void getIssuedBooks(){
        if (issuedBooks.length < 0){
            System.out.println("No issued books found!");
            return;
        }

        for(String b : issuedBooks){
            System.out.println("Book: " + b);
        }

        for (int i = 0; i < size2; i++) {
            System.out.println("Book "+(i+1) + issuedBooks[i]);
        }
    }

}

public class Lec19_OnlineLibraryStore {

    public static void main(String[] args) {

        Library l = new Library();
        l.addBook();
        l.getBooks();
        l.setIssuedBook();
        l.getIssuedBooks();

    }

}
