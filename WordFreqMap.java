
/**
 *  Word Frequencies using Map 
 *  @version 1.0
 */
import edu.duke.*;
import java.util.*;
public class WordFreqMap {
    public void countWords(){
        FileResource fr = new FileResource();
        HashMap <String,Integer> map = new HashMap<String,Integer>();
        int total = 0;
        for(String w:fr.words()){
            w = w.toLowerCase();
            total++;
            if(map.keySet().contains(w)){
                 map.put(w,map.get(w)+1);
            }
            else{
                map.put(w,1);
            }
            
        }
        System.out.println("Total Words: "+total);
        System.out.println("Words Occurences more than 200");
        for(String w:map.keySet()){
            int occurences = map.get(w);
            if(occurences>200){
                System.out.println(w+"\t"+occurences);
        }
        }

    }
}
