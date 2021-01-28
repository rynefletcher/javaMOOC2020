import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owedMoney;
    
    public IOU(){
        this.owedMoney = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.owedMoney.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.owedMoney.getOrDefault(toWhom, 0.0);
    }
}
