package Methods.Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char start=s.next().charAt(0);
        char end=s.next().charAt(0);
        charactersInRange(start,end);
    }

    public static void charactersInRange(char start, char end){
       if(start>end){
           char temp=start;
           start=end;
           end=temp;

       }
        for(char i=(char)(start+1);i<end;i++){
            System.out.print(i+" ");

        }
    }
}