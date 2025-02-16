package Methods.Exercises;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1=Integer.parseInt(s.nextLine());
        int y1=Integer.parseInt(s.nextLine());
        int x2=Integer.parseInt(s.nextLine());
        int y2=Integer.parseInt(s.nextLine());

        points(x1,x2,y1,y2);
    }

    public static void points(int x1,int x2, int y1, int y2){
        double distance1=Math.sqrt(x1*x1+y1*y1);
        double distance2=Math.sqrt(x2*x2+y2*y2);
        if(distance2>distance1){System.out.printf("(%d, %d)%n", x1,y1);}
        else{System.out.printf("(%d, %d)%n", x2,y2);}

    }
}
