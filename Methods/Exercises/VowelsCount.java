package Methods.Exercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();
        System.out.println(countOfVowels(input));
    }

    public static int countOfVowels(String input){
        int counter=0;
        for(int i=0;i<input.length();i++){
            char symbol=input.charAt(i);
            if(symbol=='a' || symbol=='e' || symbol=='i' || symbol=='o' || symbol=='u'
            || symbol=='A' || symbol=='E' || symbol=='I' || symbol=='O' || symbol=='U'){
                counter++;
            }
        }return counter;
    }

}
