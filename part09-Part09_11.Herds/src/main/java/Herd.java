import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herdList;
    
    public Herd(){
        herdList = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        herdList.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable moveObj : herdList){
            moveObj.move(dx, dy);
        }
    }
    
    public String toString(){
        String positions = "";
        
        for(Movable moveObj : herdList){
            positions += moveObj.toString() + "\n";
        }
        
        return positions;
    }
}
