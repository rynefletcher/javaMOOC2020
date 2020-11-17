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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int holdCaseWeight = 0;
        for(Suitcase suitC : suitcases){
            holdCaseWeight += suitC.totalWeight();
        }
        if((this.maxWeight - holdCaseWeight) >= suitcase.totalWeight()){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        int holdCaseWeight = 0;
        for(Suitcase suitC : suitcases){
            holdCaseWeight += suitC.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + holdCaseWeight + " kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
    
}
