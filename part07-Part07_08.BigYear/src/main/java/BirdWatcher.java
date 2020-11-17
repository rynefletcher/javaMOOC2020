/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class BirdWatcher {
    private ArrayList<Bird> birdDatabase;
    
    public BirdWatcher(){
        this.birdDatabase = new ArrayList<Bird>();
    }
    
    public void add(String name, String latinName){
        Bird bird = new Bird(name, latinName);
        this.birdDatabase.add(bird);
    }
    
    public void observation(String name){
        for(Bird bird : birdDatabase){
            if(bird.getName().equalsIgnoreCase(name) || bird.getLatinName().equalsIgnoreCase(name)){
                bird.observations();
                return;
            }
        }
        System.out.println("That's no bird!");
    }
    
    public void printAll(){
        for(Bird bird : birdDatabase){
            System.out.println(bird.toString());
        }
    }
    
    public void printOne(String name){
        for(Bird bird : birdDatabase){
            if(bird.getName().equalsIgnoreCase(name) || bird.getLatinName().equalsIgnoreCase(name)){
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Not a bird I know!");
    }
}


/*Things a bird watcher can do:
add a bird
observe a bird
all - print all birds
one - prints one bird
quit - ends program
*/