package Methods.Exercises;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int c=Integer.parseInt(s.nextLine());

        sign(a,b,c);
    }

    public static void sign(int a,int b,int c){
        if(a==0 || b==0 || c==0){System.out.println("zero");}
        else if(a<0 || b<0 || c<0){System.out.println("negative");}
        else {System.out.println("positive");}
    }
}
