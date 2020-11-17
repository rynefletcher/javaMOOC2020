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

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics statistics;
    
    
    public UserInterface(Scanner scanner, GradeStatistics statistics){
        this.scanner = scanner;
        this.statistics = statistics;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        while(userInput != -1){
            if(userInput >= 0 && userInput <= 100){
                addPoint(userInput);
            }
            userInput = Integer.valueOf(scanner.nextLine());
        }
        
        System.out.println("Point average (all): " + findAveragePoints());
        
        if(this.statistics.averagePassing() != 0.0){
            System.out.println("Point average (passing): " + findAveragePassing());
        }else{
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: " + findPassPercentage());
        System.out.println("Grade distribution:");
        findPointsToGrade();
    }
    
    public void addPoint(int point){
        this.statistics.add(point);
    }
    
    public double findAveragePoints(){
        return this.statistics.averagePoints();
    }
    
    public double findAveragePassing(){
        return this.statistics.averagePassing();
    }
    
    public double findPassPercentage(){
        return this.statistics.passPercentage();
    }
    
    public void findPointsToGrade(){
        this.statistics.pointsToGrade();
    }
}
