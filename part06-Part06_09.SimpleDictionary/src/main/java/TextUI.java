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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDiction;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDiction){
        this.scanner = scanner;
        this.simpleDiction = simpleDiction;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String word = scanner.nextLine();
        
            if(word.equalsIgnoreCase("end")){
                System.out.println("Bye bye!");
                break;
            }else if(word.equalsIgnoreCase("add")){
                System.out.println("Word: ");
                String addWord = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                simpleDiction.add(addWord, translation);
            }else if(word.equalsIgnoreCase("search")){
                System.out.println("To be translated: ");
                String translate = scanner.nextLine();
                
                String wordTranslated = this.simpleDiction.translate(translate);
                if(wordTranslated == null){
                    System.out.println("Word " + translate + " was not found");
                }else{
                    System.out.println("Translation: " + wordTranslated);
                }
            }else{
                System.out.println("Unknown command");
            }
        }
    }
}
