
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userNums = new ArrayList<>();
        
        while(true){
            int userInput = Integer.parseInt(scanner.nextLine());
            
            if(userInput < 0){
                break;
            }
            
            userNums.add(userInput);
        }
        
        userNums.stream()
            .filter(number -> number <= 5)
            .forEach(num -> System.out.println(num + "\n"));
    }
}
