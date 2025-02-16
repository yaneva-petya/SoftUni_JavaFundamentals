package ExamPreparation.Exercise;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int days=Integer.parseInt(s.nextLine());
        int plunderForADay=Integer.parseInt(s.nextLine());
        double expectedPlunder=Double.parseDouble(s.nextLine());

        double result=0;
        for(int i=1;i<=days;i++){
            result+=plunderForADay;
            if(i%3==0){
                double extra=0.5*plunderForADay;
                result+=extra;
            }

            if(i%5==0){
                result=result-result*0.3;
            }
        }

        //System.out.println(result);
        if(result>=expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.%n", result);
        }
        else{
            double percent=(result/expectedPlunder)*100;
            System.out.printf("Collected only %.2f%% of the plunder.%n", percent);
        }
    }
}
