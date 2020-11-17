/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private BirdWatcher birdWatcher;
    
    public UserInterface(Scanner scan, BirdWatcher birdWatcher){
        this.scan = scan;
        this.birdWatcher = birdWatcher;
    }
    
    public void start(){
        while(true){
            System.out.print("? ");
            String userInput = scan.nextLine();
            if(userInput.equalsIgnoreCase("quit")){
                break;
            }else{
                userCommand(userInput, scan);
            }
        }
    }
    
    public void userCommand(String userInput, Scanner scan){
        if(userInput.equalsIgnoreCase("add")){
            addBird(scan);
        }else if(userInput.equalsIgnoreCase("observation")){
            observeBird(scan);
        }else if(userInput.equalsIgnoreCase("all")){
            printAllBirds();
        }else if(userInput.equalsIgnoreCase("one")){
            printOneBird(scan);
        }else{
            System.out.println("Not a valid command!");
        }
    }
    
    public void addBird(Scanner scan){
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin:");
        String latinName = scan.nextLine();
        this.birdWatcher.add(name, latinName);
    }
    
    public void observeBird(Scanner scan){
        System.out.print("Bird?");
        String name = scan.nextLine();
        this.birdWatcher.observation(name);
    }
    
    public void printAllBirds(){
        this.birdWatcher.printAll();
    }
    
    public void printOneBird(Scanner scan){
        System.out.print("Bird?");
        String name = scan.nextLine();
        this.birdWatcher.printOne(name);
    }
}
