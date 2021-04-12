import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> historyList;
    
    public ChangeHistory(){
        this.historyList = new ArrayList<>();
    }
    
    public void add(double status){
        this.historyList.add(status);
    }
    
    public void clear(){
        this.historyList.clear();
    }
    
    public double maxValue(){
        if(this.historyList.isEmpty()){
            return 0;
        }
        
        double largest = this.historyList.get(0);
        for(double change : this.historyList){
            if(change > largest){
                largest = change;
            }
        }
        return largest;
    }
    
    public double minValue(){
        if(this.historyList.isEmpty()){
            return 0;
        }
        
        double smallest = this.historyList.get(0);
        for(double change : this.historyList){
            if(change < smallest){
                smallest = change;
            }
        }
        return smallest;
    }
    
    public double average(){
        if(this.historyList.isEmpty()){
            return 0;
        }
        
        int count = 0;
        double sum = 0;
        double average = 0;
        
        for(double change : this.historyList){
            sum += change;
            count++;
        }
        
        average = sum / (double)(count);
        return average;
    }
    
    public String toString(){
        return this.historyList.toString();
    }
}
