
/**
 * Write a description of WordFrequencies here.
 * 
 * @author (your name) 
 * @version 1.0
 */
import edu.duke.*;
import java.util.ArrayList;

public class WordFrequencies {
    private ArrayList<String>myWords;
    public WordFrequencies(){
        myWords = new ArrayList<String>();
    }
    
    public void findUnique(){
        FileResource resource = new FileResource();
        for(String s:resource.words()){
            s = s.toLowerCase();
            int index = myWords.indexOf(s);
        }
    }

}
