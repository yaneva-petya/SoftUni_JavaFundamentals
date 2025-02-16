package Methods.Exercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());

        long factA=factorial(a);//Here we can have very, very big integers, for that reason it is a better idea to use long instead of int;
        long factB=factorial(b);

        System.out.printf("%.2f", division(factA,factB));
    }

    public static double division(long a, long b){
        return a/(double)b;
    }

    public static long factorial(int a){
        long result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
}

