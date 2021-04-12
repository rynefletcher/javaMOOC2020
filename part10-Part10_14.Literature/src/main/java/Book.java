
public class Book {
    private String name;
    private int recAge;
    
    public Book(String name, int recAge){
        this.name = name;
        this.recAge = recAge;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getRecAge(){
        return this.recAge;
    }
    
    public String toString(){
        return this.name + "(recommended for " + this.recAge + 
                " year-olds or older)";
    }
}
