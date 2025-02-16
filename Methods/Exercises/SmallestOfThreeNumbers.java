package Methods.Exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int c=Integer.parseInt(s.nextLine());
        System.out.print(smallestNumber(a,b,c));
    }

    public static int smallestNumber(int a, int b, int c){
        if(a<=b && a<=c){
            return a;
        }
        if(b<=a && b<=c){
            return b;
        }
        return c;

    }
}
