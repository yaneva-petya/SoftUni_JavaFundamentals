package Methods.Exercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String command=s.nextLine();
       while(!command.equals("END")){
            palindromeNum(command);
            command=s.nextLine();
        }

    }

    public static void palindromeNum(String input){

        String newInput="";
        for(int i=0;i<input.length();i++){
            char symbol=input.charAt(input.length()-i-1);
            newInput+=symbol;
        }
       // System.out.println(newInput);

        if(!input.equals(newInput)){
            System.out.println("false");;
        }
        else{
            System.out.println("true");}
    }
}
