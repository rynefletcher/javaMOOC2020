import java.util.ArrayList;

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> itemsInBox;
    
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
    }
    
    public void add(Packable itemToPack){
        if(this.weight() + itemToPack.weight() <= this.maxCapacity){
            itemsInBox.add(itemToPack);
        }
    }
    
    public double weight(){
        double sum = 0;
        
        for(Packable item : this.itemsInBox){
            sum += item.weight();
        }
        
        return sum;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.itemsInBox.size() + " items, total weight " +
                this.weight() + " kg";
    }
}
