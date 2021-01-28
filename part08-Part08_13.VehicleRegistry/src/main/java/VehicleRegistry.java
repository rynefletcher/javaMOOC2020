import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> licenseHashMap;
    
    public VehicleRegistry(){
        this.licenseHashMap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        for(LicensePlate license : licenseHashMap.keySet()){
            if(license.equals(licensePlate)){
                return false;
            }
        }
        licenseHashMap.put(licensePlate, owner);
        
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return licenseHashMap.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(!licenseHashMap.containsKey(licensePlate)){
            return false;
        }
        
        licenseHashMap.remove(licensePlate);
        
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate license : licenseHashMap.keySet()){
            System.out.println(license);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        
        for(String owner : licenseHashMap.values()){
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        
        for(String name : owners){
            System.out.println(name);
        }
    }
}
