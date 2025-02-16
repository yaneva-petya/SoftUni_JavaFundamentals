package Methods.Exercises;


import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int c=Integer.parseInt(s.nextLine());

        int sum=sum(a,b);
        int diff=subtract(sum,c);
        System.out.println(diff);
    }


    public static int sum(int a, int b){

       return a+b;
    }

    public static int subtract(int c, int d){
        return c-d;
    }

}
