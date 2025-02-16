package Methods.Lecture;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number=Integer.parseInt(s.nextLine());

        int result=getMultipleOfEvensAndOdds(number);
        System.out.println(result);

    }

    public static int getMultipleOfEvensAndOdds(int input){

        return Math.abs(sumOfEvens(input)*sumOfOdds(input));

    }

    public static int sumOfEvens(int input){
        int number=Math.abs(input);
        int sumOfEvens=0;
        while(number>0){
            int digit=number%10;
            if(digit%2==0){
                sumOfEvens+=digit;
            }
            number/=10;
        }
        return sumOfEvens;
    }
    public static int sumOfOdds(int input){
        int number=Math.abs(input);
        int sumOfOdds=0;
        while(Math.abs(number)>0){
            int digit=number%10;
            if(digit%2!=0){
                sumOfOdds+=digit;
            }
            number/=10;
        }
        return sumOfOdds;
    }
}
