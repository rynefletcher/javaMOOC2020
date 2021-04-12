import java.util.ArrayList;

public class MisplacingBox extends Box{
    private ArrayList<Item> misplacedItemBox;
    
    public MisplacingBox(){
        this.misplacedItemBox = new ArrayList<>();
    }
    
    public void add(Item item){
        this.misplacedItemBox.add(item);
    }
    
    public boolean isInBox(Item item){
        return false;
    }
}
