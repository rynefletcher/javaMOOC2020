
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
    
    public static void printValues(HashMap<String, Book> hashmap){
        for(Book v : hashmap.values()){
            System.out.println(v);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
        text = sanitizeString(text);
        
        for(Book book : hashmap.values()){
            if(!book.getName().contains(text)){
                continue;
            }
            
            System.out.println(book);
        }
    }
    
    public static String sanitizeString(String text){
        text = text.toLowerCase();
        text = text.trim();
        
        return text;
    }
}
