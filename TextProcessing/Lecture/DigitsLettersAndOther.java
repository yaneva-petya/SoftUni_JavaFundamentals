package TextProcessing.Lecture;

import java.util.*;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();

        StringBuilder digits=new StringBuilder();//all symbols which are symbols;
        StringBuilder letters=new StringBuilder();//all symbols which are letters;
        StringBuilder others=new StringBuilder();//all others symbol;

        for(char symbol:input.toCharArray()){
            if(Character.isDigit(symbol)){
                digits.append(symbol);
            }
            else if(Character.isLetter(symbol)){
                letters.append(symbol);
            }
            else{
                others.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
