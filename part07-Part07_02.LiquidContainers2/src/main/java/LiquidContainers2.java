
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();
        
        UserInterface ui = new UserInterface(container1, container2, scanner);
        
        ui.start();
//        System.out.println(container);
//        
//        container.add(50);
//        System.out.println(container);
//        System.out.println(container.contains());
//        
//        container.remove(60);
//        System.out.println(container);
//        
//        container.add(200);
//        System.out.println(container);
//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//
//        }
    }

}
