package Methods.Lecture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         double num= Double.parseDouble(s.nextLine());
         int pow=Integer.parseInt(s.nextLine());

         String product=new DecimalFormat("0.####").format(mathPower(num,pow));
         System.out.println(product);
    }

    public static double mathPower(double number, int power){

        return Math.pow(number,power);
    }
}
