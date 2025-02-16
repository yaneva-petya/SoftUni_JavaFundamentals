package Methods.Lecture;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String product=s.nextLine();
        int count=Integer.parseInt(s.nextLine());
        orders(product,count);
    }

    public static void orders(String order, int count){
        switch (order){
            case "coffee": coffee(count);break;
            case "water": water(count); break;
            case "coke": coke(count);break;
            case "snacks": snacks(count);break;
        }
    }

    public static void coffee(int count){
        double result=1.50*count;
        System.out.printf("%.2f%n", result);
    }

    public static void water(int count){
        double result=1.00*count;
        System.out.printf("%.2f%n", result);
    }

    public static void coke(int count){
        double result=1.40*count;
        System.out.printf("%.2f%n", result);
    }

    public static void snacks(int count){
        double result=2.00*count;
        System.out.printf("%.2f%n", result);
    }

}
