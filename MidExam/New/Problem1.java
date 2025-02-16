package MidExam.New;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double price=Double.parseDouble(s.nextLine());
        int months=Integer.parseInt(s.nextLine());

        double savedMoney=0;
        for(int i=1;i<=months;i++){

            if(i!=1 && i%2!=0){
                savedMoney-=savedMoney*0.16;
            }

            if(i%4==0){
                savedMoney+=savedMoney*0.25;
            }
            savedMoney+=price*0.25;
        }

        if(price<savedMoney){
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", savedMoney-price);
        }
        else{
            System.out.printf("Sorry. You need %.2flv. more.", price-savedMoney);
        }
    }
}
