
public class CD implements Packable{
    private String artist;
    private String cdName;
    private int pubYear;
    private double cdWeight;
    
    public CD(String artist, String cdName, int pubYear){
        this.artist = artist;
        this.cdName = cdName;
        this.pubYear = pubYear;
        this.cdWeight = 0.1;
    }
    
    public double weight(){
        return this.cdWeight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.cdName + " (" + this.pubYear + ")";
    }
}
