/*
counting common words.
*/

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
        return common;
    }
    
    public int indexOf(String []list,String word){
        for(int k=0; k<list.length; k++){
            if(list[k].equals(word)){
                return k;
            }
        }
        return -1;
    }
    
    public void countWords(FileResource resource,String [] common,int[] counts){
        for(String s:resource.words()){
            s = s.toLowerCase();
            int index = indexOf(common,s);
            if(index != -1)
            {
                counts[index] += 1;
            }
        }
     }
         
         
    public void countShakespeare(){
        String []plays = {"caesar.txt","errors.txt","hamlet.txt","likeit.txt","macbeth.txt","romeo.txt"};
        String []common = getCommon();
        int []counts = new int[common.length];
        for(int k=0; k<plays.length; k++){
            FileResource resource = new FileResource("data/"+plays[k]);
            countWords(resource,common,counts);
            System.out.println("done with "+plays[k]);
        }
        
        for(int k=0; k<common.length; k++){
            System.out.println(common[k]+"\t"+counts[k]);
        }
    }

}


/*
OUTPUT
--------
done with caesar.txt
done with errors.txt
done with hamlet.txt
done with likeit.txt
done with macbeth.txt
done with romeo.txt
the	4237
of	2826
and	3911
to	2843
a	2212
in	1674
for	1071
is	1480
on	402
that	1679
by	531
this	937
with	1166
i	2939
you	1788
it	1063
not	1194
or	356
be	942
are	506
*/
