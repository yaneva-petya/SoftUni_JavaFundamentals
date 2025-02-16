package Methods.Exercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       int n=Integer.parseInt(s.nextLine());
       topNumber(n);
    }

    public static void topNumber(int n) {


        for (int i = 1; i <= n; i++) {

            int sumOfDigits = 0;
            int oddCounter = 0;
            int num=i;

            while (num > 0) {
                int digit = num % 10;
                sumOfDigits += digit;
                if (digit % 2 != 0) {
                    oddCounter++;
                }
                num /= 10;
            }

            if (sumOfDigits % 8 == 0 && oddCounter >= 1) {
                System.out.println(i);
            }
        }

    }
}
