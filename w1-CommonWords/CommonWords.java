
import edu.duke.*;
public class CommonWords {
    
    public String[] getCommon(){
        FileResource resource = new FileResource("data/common.txt");
        String []common = new String[20];
        int index = 0;
        for(String s:resource.words()){
            common[index] = s;
            index+=1;
        }
    }
    
    public void countShakespeare(){
        String []plays = {"caeser.txt","errors.txt","hamlet.txt","likeit.txt","macbeth.txt","romeo.txt"};
        String []common = getCommon();
        int []counts = new int[common.length];
        for(int k = 0;k < plays.length;k++){
            FileResource resource = new FileResource("data/"+plays[k]);
            CountWords(resource,common,counts);
            System.out.println("done with "+plays[k]);
        }
        
        for(int k = 0;k < common.length;k++){
            System.out.println(common[k]+"\t"+counts[k]);
        }
    }

}
