import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageItems;
    
    public StorageFacility(){
        this.storageItems = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storageItems.putIfAbsent(unit, new ArrayList<>());
        
        this.storageItems.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> emptyList = new ArrayList<>();
        
        return this.storageItems.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item){
        this.storageItems.get(storageUnit).remove(item);
        
        if(this.storageItems.get(storageUnit).isEmpty()){
            this.storageItems.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnitKeys = new ArrayList<>();
        
        for(String name : this.storageItems.keySet()){
            if(!this.storageItems.get(name).isEmpty()){
                storageUnitKeys.add(name);
            }
        }
        
        return storageUnitKeys;
    }
}
