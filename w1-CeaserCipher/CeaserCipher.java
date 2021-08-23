
/**
 * Implementing CeaserCipher.
 * 
 * 
 */
import edu.duke.*;
public class CeaserCipher {
      public String encrypt(String input,int key){
          StringBuilder encrypted = new StringBuilder(input);
          String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          String shifted = alphabet.substring(key)+alphabet.substring(0,key);
          for(int i = 0;i<encrypted.length();i++){
              char currChar = encrypted.charAt(i);
              int indx = alphabet.indexOf(currChar);
              if(indx!=-1){
                  char newChar = shifted.charAt(indx);
                  encrypted.setCharAt(i,newChar);
                   
                }
            }
          return encrypted.toString();
      }
      
      public void test(){
          int key = 17;
          FileResource fr = new FileResource();
          String message = fr.asString();
          String encrypted = encrypt(message,key);
          System.out.println("Encrypted:"+encrypted);
          String decrypted = encrypt(encrypted,26-key);
          System.out.println("Decrypted:"+decrypted);
        }

}
