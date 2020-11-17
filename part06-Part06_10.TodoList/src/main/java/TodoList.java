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

public class TodoList {
    
    private ArrayList<String> taskList = new ArrayList<String>();
    
    public TodoList(){
        
    }
    
    public void add(String task){
        this.taskList.add(task);
    }
    
    public void print(){
        for(String task: taskList){
            System.out.println((this.taskList.indexOf(task) + 1) + ": " + task);
        }
    }
    
    public void remove(int number){
        number--;
        this.taskList.remove(number);
    }
}
