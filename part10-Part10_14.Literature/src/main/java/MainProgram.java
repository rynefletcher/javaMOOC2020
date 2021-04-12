import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        int counter = 0;
        
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String bookName = scanner.nextLine();
            
            if(bookName.equals("")){
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            int recAge = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(bookName, recAge));
            
            counter++;
        }
        
        System.out.println(counter + " books in total.");
        System.out.println("Books:");
//        for(Book b : books){
//            System.out.println(b);
//        }
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        for(Book b : books){
            System.out.println(b);
        }
    }

}
