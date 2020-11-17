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

public class Room {
    ArrayList<Person> people = new ArrayList<>();
    
    public Room(){
        
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        if(people.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return people;
    }
    
    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }
        Person shortest = this.people.get(0);
        for(Person person : people){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take(){
        if(this.people.isEmpty()){
            return null;
        }
        
        Person shortPerson = this.shortest();
        this.people.remove(shortPerson);
        return shortPerson;
    }
}
