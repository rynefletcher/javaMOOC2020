import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> itemsInBox;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }
    
    public int currentAmount(){
        int sum = 0;
        
        for(Item item : itemsInBox){
            sum += item.getWeight();
        }
        return sum;
    }
    
    public void add(Item item){
        if(currentAmount() + item.getWeight() <= this.capacity){
            itemsInBox.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        return itemsInBox.contains(item);
    }
    
}
