package TextProcessing.Exercise;

import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text=s.nextLine();
        StringBuilder encryptText=new StringBuilder();

        for(char symbol:text.toCharArray()){
            char encryptedSymbol=(char)(symbol+3);
            encryptText.append(encryptedSymbol);

        }
        System.out.println(encryptText);
    }
}
