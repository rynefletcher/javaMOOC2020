
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyList = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, 
            double capacity, double initialBalance){
        super(productName, capacity);
        
        super.addToWarehouse(initialBalance);
        
        historyList.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        double result = 0;
        
        result = (double) super.getBalance() + amount;
        
        historyList.add(result);
        
        super.addToWarehouse(amount);
    }
    
    public double takeFromWarehouse(double amount){
        double result = 0;
        
        result = (double) super.getBalance() - amount;
        
        historyList.add(result);
        
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.historyList);
        System.out.println("Largest amount of product: " + this.historyList.maxValue());
        System.out.println("Smallest amount of product: " + this.historyList.minValue());
        System.out.println("Average: " + this.historyList.average());
    }
    
    public String history(){
        return historyList.toString();
    }
}
