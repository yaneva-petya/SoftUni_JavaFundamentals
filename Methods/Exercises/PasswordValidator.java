package Methods.Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();
        if(validPassword(input)){
            System.out.println("Password is valid");
        }

    }

    public static boolean characterValidator(String input){

        if(input.length()<6 || input.length()>10){
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    public static boolean lettersAndDigitsValidator(String input){
        for(int i=0;i<input.length();i++){
            char s=input.charAt(i);
            if (!((s >= 48 && s <= 57) || (s >= 65 && s <= 90) || (s>=97 && s<=122))){
                System.out.println("Password must consist only of letters and digits");
                return false;

            }
        }return true;
    }

    public static boolean digitsValidator(String input){
        int digitsCounter=0;
        for(int i=0;i<input.length();i++){
            char s=input.charAt(i);
            if(s>=48 && s<=57 ){digitsCounter++;}
        }
        if(digitsCounter<2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }

    public static boolean validPassword(String input) {
       boolean isCharacterValidator=characterValidator(input);
       boolean isLDValidator=lettersAndDigitsValidator(input);
       boolean isdValidator=digitsValidator(input);

       return isLDValidator && isCharacterValidator && isdValidator;

    }
}
