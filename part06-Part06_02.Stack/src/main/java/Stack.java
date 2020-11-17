/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rynef
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;
    
    public Stack(){
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.stacks.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.stacks.add(value);
    }
    
    public String take(){
        String lastIn = this.stacks.get(this.stacks.size() - 1);
        this.stacks.remove(this.stacks.size() - 1);
        
        return lastIn;
    }
    
    public ArrayList<String> values(){
        return this.stacks;
    }
}
