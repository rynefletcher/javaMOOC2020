
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputs = new ArrayList<>();
        
        
        while(true){
            String row = scanner.nextLine();
            if(row.equals("end")){
                break;
            }
            
            inputs.add(row);
        }
        
        double negativeAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
        double positiveAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >=0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative"
                + " numbers of the positive numbers? (n/p)");
        String negPos = scanner.nextLine();
        
        if(negPos.equals("n")){
            System.out.println("Average of the negative numbers: " + 
                    negativeAverage);
        }else{
            System.out.println("Average of the positive numbers: " +
                    positiveAverage);
        }

    }
}
