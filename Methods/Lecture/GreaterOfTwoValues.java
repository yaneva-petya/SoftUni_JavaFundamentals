package Methods.Lecture;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String type=s.nextLine();
        if(type.equals("int")){
            int a=Integer.parseInt(s.nextLine());
            int b=Integer.parseInt(s.nextLine());
            int result=getMaxInt(a,b);

System.out.println(result);
        }else if(type.equals("char")){
            char a=s.nextLine().charAt(0);
            char b=s.nextLine().charAt(0);
            char result=getMaxChar(a,b);
            System.out.println(result);
        }
        else if(type.equals("string")){
            String a=s.nextLine();
            String b=s.nextLine();
            String result=getMaxString(a,b);
            System.out.println(result);
        }

    }

    public static int getMaxInt(int first, int second){
        if(first>second){
            return first;
        }
        return second;
    }

    public static char getMaxChar(char first, char second){
        if(first>second){
            return first;
        }
        return second;

    }

    public static String getMaxString(String first, String second){
        if(first.compareTo(second)>=0){
            return first;
        }
        return second;
    }
}
