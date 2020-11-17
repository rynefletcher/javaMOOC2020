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
import java.util.Scanner;
        
public class GradeStatistics {
        
    // Write your program here -- consider breaking the program into 
    // multiple classes.
    
    private ArrayList<Integer> points;
    
    public GradeStatistics(){
        this.points = new ArrayList<>();
    }
    
    public void add(int point){
        this.points.add(point);
    }
    
    public double averagePoints(){
        double sum = 0;
        for(int point : points){
           sum += point;
        }
        
        return sum / this.points.size();
    }
    
    public double averagePassing(){
        double sum = 0;
        int countThatPass = 0;
        for(int point : points){
            if(point >= 50){
                sum += point;
                countThatPass++;
            }
        }
        
        if(countThatPass != 0){
            return sum / countThatPass;
        }
        
        return 0;
    }
    
    public double passPercentage(){
        int countThatPass = 0;
        for(int point : points){
            if(point >= 50){
                countThatPass++;
            }
        }
        
        return ((1.0 * countThatPass) / this.points.size()) * 100;
    }
    
    public void pointsToGrade(){
        ArrayList<Integer> grades = new ArrayList<>();
        for(int point : points){
            if(point < 50){
                grades.add(0);
            }else if(point < 60){
                grades.add(1);
            }else if(point < 70){
                grades.add(2);
            }else if(point < 80){
                grades.add(3);
            }else if(point < 90){
                grades.add(4);
            }else{
                grades.add(5);
            }
        }
        
        for(int i = 5; i >= 0; i--){
            System.out.println(i + ": " + stars(grades,i));
        }
    }
    
    private String stars(ArrayList<Integer> grades, int number){
        String star = "";
        for(int grade : grades){
            if(grade == number){
                star += "*";
            }
        }
        
        return star;
    }
}