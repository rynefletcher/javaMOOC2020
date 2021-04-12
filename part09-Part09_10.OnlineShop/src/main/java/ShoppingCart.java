import java.util.*;

public class ShoppingCart {
    private Map<String, Item> shopCart;
    
    public ShoppingCart(){
        this.shopCart = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.shopCart.containsKey(product)){
            increaseQuantity(product);
        }else{
            shopCart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        int total = 0;
        
        for(Item item : shopCart.values()){
            total += item.price();
        }
        
        return total;
    }
    
    public void increaseQuantity(String product){
        this.shopCart.get(product).increaseQuantity();
    }
    
    public void print(){
        for(String item : shopCart.keySet()){
            System.out.println(shopCart.get(item).toString());
        }
    }
}
