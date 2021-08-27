
/**
 * Dice rolling using random class.
 * 
 */
import java.util.Random;
public class DiceRoll {
    public static void simpleSimulate(int rolls){
        Random rand = new Random();
        int twos = 0;
        int twelves = 0;
        for(int i=0;i<rolls;i++){
            int d1 = rand.nextInt(6)+1;
            int d2 = rand.nextInt(6)+1;
            if(d1+d2==2){
                twos++;
            }
            else if(d1+d2==12){
                twelves++;
            }
        }
        System.out.println("twos = "+twos+" twelves= "+twelves);
        
        
    }
    public static void main(String[]args){
        simpleSimulate(100);
    }

}
/*OUTPUT
 * ------
 *twos = 2 twelves = 2
 */