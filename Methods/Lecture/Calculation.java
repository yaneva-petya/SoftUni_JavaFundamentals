package Methods.Lecture;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String operation=s.nextLine();
        int firstNumber=Integer.parseInt(s.nextLine());
        int secondNumber=Integer.parseInt(s.nextLine());
        calculator(operation,firstNumber,secondNumber);

    }

    public static void calculator(String command, int firstNum, int secondNum){

       switch (command){
           case "add":add(firstNum,secondNum);break;
           case "multiply": multiply(firstNum,secondNum);break;
           case "subtract": subtract(firstNum,secondNum);break;
           case "divide": divide(firstNum,secondNum); break;

       }



    }

    public static void add(int first, int second){
        int result=first+second;
        System.out.println(result);
    }
    public static void multiply(int first, int second){
        int result=first*second;
        System.out.println(result);
    }
    public static void subtract(int first, int second){
        int result=first-second;
        System.out.println(result);
    }
    public static void divide(int first, int second){
        if(second!=0){
            int result=first/second;
            System.out.println(result);
        }
    }

}
