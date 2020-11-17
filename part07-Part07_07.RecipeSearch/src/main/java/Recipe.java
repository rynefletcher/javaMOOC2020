/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rynef
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients = new ArrayList<>();
    
    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        for(String ingredient : ingredients){
            this.ingredients.add(ingredient);
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getTime(){
        return this.time;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    @Override
    public String toString(){
        return this.getName() + ", cooking time: " + this.getTime();
    }
}
