
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userStrings = new ArrayList<>();
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.equals("")){
                break;
            }
            
            userStrings.add(userInput);
        }
        
        System.out.println(userStrings);
    }
}
