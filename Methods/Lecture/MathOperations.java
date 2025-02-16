package Methods.Lecture;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a=Integer.parseInt(s.nextLine());
        String command=s.nextLine();
        int b=Integer.parseInt(s.nextLine());
        System.out.println(calculate(a,command,b));
    }

    private static int calculate(int a, String operation, int b){
        int product=0;
        switch (operation){
            case "+": product=a+b; break;
            case "-": product=a-b; break;
            case "*": product=a*b;break;
            case "/": product=a/b;break;
        }
        return product;
    }
}
