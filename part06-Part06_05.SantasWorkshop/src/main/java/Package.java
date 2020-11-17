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

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        int tWeight = 0;
        if(this.gifts.isEmpty()){
            return -1;
        } else{
            for(Gift gift : gifts){
                tWeight += gift.getWeight();
        }
            return tWeight;
        }
    }
}
