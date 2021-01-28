import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordTranslations;
    
    public DictionaryOfManyTranslations(){
        this.wordTranslations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.wordTranslations.putIfAbsent(word, new ArrayList<>());
        
//        ArrayList<String> translations = this.wordDefinitions.get(word);
//        translations.add(definition);
        
        this.wordTranslations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> emptyList = new ArrayList<>();
        
        return this.wordTranslations.getOrDefault(word, emptyList);
    }
    
    public void remove(String word){
        this.wordTranslations.remove(word);
    }
}
