package Lists.Lecture.Codes;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> num= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> positiveNum=new ArrayList<>();

        for(int number:num){
            if(number>0){
                positiveNum.add(number);
            }
        }

        if(positiveNum.isEmpty()){
            System.out.println("empty");
        }
        else{
            Collections.reverse(positiveNum);

            for(int n:positiveNum){
                System.out.print(n+" ");
            }
        }
    }
}
