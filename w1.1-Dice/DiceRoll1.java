
/**
 * COUNTING THE OCCURENCES OF COUNTS WHEN DICE ROLLED USING RANDOM CLASS.
 */
import java.util.Random;
public class DiceRoll1 {
    public static void simulate(int rolls){
        Random rand = new Random();
        int []counts = new int[13];
        for(int i = 0;i < rolls;i++){
            int d1 = rand.nextInt(6)+1;
            int d2 = rand.nextInt(6)+1;
            System.out.println("Roll is:"+d1+"+"+d2+"="+(d1+d2));
            counts[d1+d2]+=1;
        }
        for(int i = 2;i <= 12;i++){
        System.out.println(i+"'s =\t"+counts[i]+"\t"+" percentage: "+100*counts[i]/rolls);
        }
        
    }
    public static void main(String[]args){
        simulate(10); // 10-no of times the dice rolls
    }

}
/*OUTPUT
 --------
Roll is:5+1=6
Roll is:6+3=9
Roll is:4+5=9
Roll is:2+4=6
Roll is:2+4=6
Roll is:2+1=3
Roll is:1+4=5
Roll is:2+1=3
Roll is:5+6=11
Roll is:2+6=8
2's =	0	 percentage: 0
3's =	2	 percentage: 20
4's =	0	 percentage: 0
5's =	1	 percentage: 10
6's =	3	 percentage: 30
7's =	0	 percentage: 0
8's =	1	 percentage: 10
9's =	2	 percentage: 20
10's =	0	 percentage: 0
11's =	1	 percentage: 10
12's =	0	 percentage: 0
*/