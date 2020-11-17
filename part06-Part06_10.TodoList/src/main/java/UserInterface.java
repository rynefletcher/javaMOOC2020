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

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private TodoList taskList = new TodoList();
    
    public UserInterface(TodoList taskList, Scanner scanner){
        this.scanner = scanner;
        this.taskList = taskList;
    }
    
    public void start(){
        while(true){
            //stop, add, list, remove
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if(command.equalsIgnoreCase("stop")){
                break;
            }else if(command.equalsIgnoreCase("add")){
                System.out.println("To add: ");
                String addTask = scanner.nextLine();
                this.taskList.add(addTask);
            }else if(command.equalsIgnoreCase("list")){
                this.taskList.print();
            }else if(command.equalsIgnoreCase("remove")){
                System.out.println("Which one is removed?");
                int removal = scanner.nextInt();
                this.taskList.remove(removal);
            }else{
                System.out.println("Command not recognized");
            }
        }
    }
}
