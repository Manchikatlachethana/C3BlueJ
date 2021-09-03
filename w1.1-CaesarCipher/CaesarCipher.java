
/**
 Encryption using CaesarCipher.
 */

public class CaesarCipher {
    private String alphabet;
    private String shiftedAlphabet;
    public CaesarCipher(int key){
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        shiftedAlphabet  = alphabet.substring(key)+alphabet.substring(0,key);
    }
    
    public String encrypt(String input){
        StringBuilder sb = new StringBuilder(input);
        for(int i=0; i<sb.length(); i++){
            char c = sb.charAt(i);
            int index = alphabet.indexOf(c);
            if(index != -1){
                c = shiftedAlphabet.charAt(index);
                sb.setCharAt(i,c);
            }
        }
        return sb.toString();
    }
    
    public  static void main(){
        CaesarCipher c = new CaesarCipher(3);
        System.out.println(c.encrypt("github"));
    }

}
/*
OUTPUT
------
jlwkxe
*/