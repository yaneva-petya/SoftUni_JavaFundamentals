package Methods.Lecture;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int area=area(a,b);
        System.out.println(area);

    }

    public static int area(int a, int b){
        int area=a*b;
        return area;
    }
}
