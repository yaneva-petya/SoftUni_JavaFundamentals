package ClassesAndObjects.Lecture;


import java.math.BigDecimal;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BigDecimal firstNumber=new BigDecimal(s.nextLine());
       // System.out.println(num);
        BigDecimal secondNumber=new BigDecimal(s.nextLine());
        System.out.println(firstNumber.add(secondNumber));
    }
}
