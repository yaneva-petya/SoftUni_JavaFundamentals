package TextProcessing.Exercise;

import java.util.*;

public class LettersChangeNumbers {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       String[] codes=s.nextLine().split("\\s+");

       double totalSum=0.0;
       for(String code: codes){
           double modifiedNumber=gettingModifiedNumber(code);

           totalSum+=modifiedNumber;

       }
       System.out.printf("%.2f%n",totalSum);
    }

    public static double gettingModifiedNumber(String code){
        char letterBefore=code.charAt(0);
        char letterAfter=code.charAt(code.length()-1);
        double number=Integer.parseInt(code.substring(1,code.length()-1));

       /* double number=Integer.parseInt(code.replace(letterBefore, ' ')
                .replace(letterAfter, ' ').trim());
                //Another idea who to get the number between 2 letters*/

        if(Character.isUpperCase(letterBefore)){
            int position=(int)letterBefore-64;
            number/=position;
        }
        else{
            int position=(int)letterBefore-96;
            number*=position;
        }

        if(Character.isUpperCase(letterAfter)){
            int position=(int)letterAfter-64;
            number-=position;
        }
        else{
            int position=(int)letterAfter-96;
            number+=position;
        }

        return number;
    }
}
