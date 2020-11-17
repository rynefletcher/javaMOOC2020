
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics statistics = new GradeStatistics();
        
        UserInterface ui = new UserInterface(scanner, statistics);
        ui.start();
        
    }
}
