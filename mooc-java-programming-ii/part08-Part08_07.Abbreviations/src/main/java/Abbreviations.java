
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdallah Fawzi
 */
public class Abbreviations {
    
    private HashMap<String, String> abbrevs;
    
    public Abbreviations() {
        this.abbrevs = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbrevs.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return abbrevs.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return abbrevs.get(abbreviation);
    }
}
