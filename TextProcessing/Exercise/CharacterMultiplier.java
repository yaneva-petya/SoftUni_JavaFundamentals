package TextProcessing.Exercise;

import java.util.*;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input=s.nextLine().split("\\s+");
        String firstInput=input[0];
        String secondInput=input[1];
        int minLength=Math.min(firstInput.length(), secondInput.length());
        int totalSum=0;

        for(int i=0;i<minLength;i++)
        {
            totalSum+=firstInput.charAt(i)*secondInput.charAt(i);
        }

        for(int i=minLength;i<firstInput.length();i++){
            totalSum+=firstInput.charAt(i);
        }
        for(int i=minLength;i<secondInput.length();i++){
            totalSum+=secondInput.charAt(i);
        }

        System.out.println(totalSum);

    }
}
