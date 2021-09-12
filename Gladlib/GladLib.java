
/**
 * Write a description of Gladlib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class GladLib {
    private ArrayList<String>adjectiveList;
    private ArrayList<String>nounList;
    private ArrayList<String>colorList;
    private ArrayList<String>countryList;
    private ArrayList<String>nameList;
    private ArrayList<String>animalList;
    private ArrayList<String>timeList;
    private ArrayList<String>verbList;
    private Random myRandom;
    
    private String dataSourceURL = "";
    private String dataSourceDirectory = "data";
    
    public GladLib(){
        initializeFromSource(dataSourceDirectory);
        myRandom = new Random();
    }
    
    public GladLib(String source){
        initializeFromSource(source);
        myRandom = new Random();
    }
    
    private void initializeFromSource(String source){
        adjectiveList = readIt(source+"/adjective.txt");
        nounList = readIt(source+"/noun.txt");
        colorList = readIt(source+"/color.txt");
        countryList = readIt(source+"/country.txt");
        nameList = readIt(source+"/name.txt");
        animalList = readIt(source+"/animal.txt");
        timeList = readIt(source+"/timeframe.txt");
        verbList = readIt(source+"/verb.txt");
        
        
    }
    
}
