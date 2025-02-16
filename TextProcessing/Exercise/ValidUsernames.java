package TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] usernames=s.nextLine().split(", ");

        for(String username: usernames){
            if(checkingUsername(username)){
                System.out.println(username);
            }
        }
    }

    public static boolean checkingUsername(String username){

        if(username.length()<3 || username.length()>16){
            return false;
        }

        for(char symbol:username.toCharArray()){
            if(!Character.isLetterOrDigit(symbol) && symbol!='-' && symbol!='_' ){
                return false;
            }
        }

        return true;
    }
}
