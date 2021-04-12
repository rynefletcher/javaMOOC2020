import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalance;
    
    
    public Warehouse(){
        this.prices = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stockBalance.put(product, stock);
    }
    
    public int price(String product){
        return this.prices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return stockBalance.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(stock(product) > 0){
            stockBalance.put(product, stockBalance.get(product) - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products(){
        Set<String> keys = this.prices.keySet();
        
        return keys;
    }
}


