package Methods.Lecture;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number=Integer.parseInt(s.nextLine());
signOfInteger(number);
    }


    public static void signOfInteger(int currentNumber){
        if(currentNumber>0){
            System.out.printf("The number %d is positive.%n", currentNumber);
        }
        else if(currentNumber<0){
            System.out.printf("The number %d is negative.%n", currentNumber);
        }
        else{
            System.out.printf("The number 0 is zero.%n");
        }
    }
}
