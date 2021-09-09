
/**
 * Write a description of WordsWithArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import edu.duke.*;

public class WordsWithArray {
    
    StorageResource myWords;
    
    public WordsWithArray(){
        myWords = new StorageResource();
    }
    
    public void readWords(){
        myWords.clear();
        FileResource resource = new FileResource();
        for(String word:resource.words()){
            myWords.add(word.toLowerCase());
         }
        
     }
     
    public boolean contains(String []list,String word,int numbers){
        for(int k=0; k<numbers; k++){
            if(list[k].equals(word)){
                return true;
            }
            
        }
        return false;
    }
    
    public int numberOfUniqueWords(){
        int numStored = 0;
        String [] words = new String[myWords.size()];
        
        for(String s:myWords.data()){
            if(! contains(words,s,numStored)){
                words[numStored] = s;
                numStored++;
            }
            
        }
        return numStored;
    }
    
    public void tester(){
        readWords();
        System.out.println("Number of words read:"+myWords.size());
        System.out.println("Unique words Array count:"+numberOfUniqueWords());
    }

}
