
public class Organism implements Movable{
    private int xDot;
    private int yDot;
    
    public Organism(int x, int y){
        this.xDot = x;
        this.yDot = y;
    }
    
    public void move(int dx, int dy){
        this.xDot += dx;
        this.yDot += dy;
    }
    
    public String toString(){
        return "x: " + xDot + "; y: " + yDot;
    }
}
