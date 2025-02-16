package Methods.Lecture;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        int times=Integer.parseInt(s.nextLine());
        String result=repeatStrings(input,times);
        System.out.println(result);
    }

    public static String repeatStrings(String input, int times){
        String newString="";
        for(int i=0;i<times;i++){
            newString+=input;
        }
        return newString;
    }
}
