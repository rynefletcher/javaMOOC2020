/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rynef
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private JokeManager jm;
    private Scanner scanner;
    
    public UserInterface(JokeManager jm, Scanner scanner){
        this.jm = jm;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scanner.nextLine();
            
            if(command.equals("X")){
                break;
            }
            
            uiCommand(command);
        }
    }
    
    public void uiCommand(String command){
        if(command.equals("1")){
            addJoke();
        } else if(command.equals("2")){
            drawJoke();
        } else{
            printJokes();
        }
    }
    
    public void addJoke(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jm.addJoke(joke);
    }
    
    public void drawJoke(){
        System.out.println("Drawing a joke.");
        System.out.println(jm.drawJoke());
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");
        jm.printJokes();
    }
}
