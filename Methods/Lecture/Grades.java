package Methods.Lecture;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double grade=Double.parseDouble(s.nextLine());
        grades(grade);
    }

    public static void grades(double currentGrade){

        if(currentGrade>=2.00 && currentGrade<=2.99){
            System.out.printf("Fail");
        }
        else if(currentGrade>=3.00 && currentGrade<=3.49){
            System.out.printf("Poor");
        }
        else if(currentGrade>=3.50 && currentGrade<=4.49){
            System.out.printf("Good");
        } else if(currentGrade>=4.50 && currentGrade<=5.49){
            System.out.printf("Very good");
        }
        else{
            System.out.printf("Excellent");
        }

    }
}
