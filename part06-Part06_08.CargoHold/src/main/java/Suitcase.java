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

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        int suitcaseWeight = 0;
        
        for(Item i : items){
            suitcaseWeight += i.getWeight();
        }
        if((this.maxWeight - suitcaseWeight) >= item.getWeight()){
            items.add(item);
        }
    }
    
    public String toString(){
        int suitcaseWeight = 0;
        
        for(Item item : items){
            if(suitcaseWeight + item.getWeight() > this.maxWeight){
                break;
            }
            suitcaseWeight += item.getWeight();
        }
        
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        
        if(this.items.size() == 1){
            return "1 item (" + suitcaseWeight + " kg)";
        }
        
        return items.size() + " items (" + suitcaseWeight + " kg)";
    }
    
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight(){
        int suitcaseWeight = 0;
        for(Item item : items){
            suitcaseWeight += item.getWeight();
        }
        
        return suitcaseWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heavyItem = items.get(0);
        for(Item item : items){
             if(heavyItem.getWeight() < item.getWeight()){
                 heavyItem = item;
             }
        }
        return heavyItem;
    }
}
