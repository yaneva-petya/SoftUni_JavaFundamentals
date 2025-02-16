package Lists.Lecture.Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> firstList= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList=Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList=new ArrayList<>();

        int minSize=Math.min(firstList.size(), secondList.size());

        for(int i=0;i<minSize;i++){
            int firstNum=firstList.get(i);
            int secondNum=secondList.get(i);

            resultList.add(firstNum);
            resultList.add(secondNum);
        }

        if(firstList.size()>secondList.size()){
            List<Integer> subList=firstList.subList(minSize, firstList.size());
            resultList.addAll(subList);
        }
        else{
            List<Integer> subList=secondList.subList(minSize, secondList.size());
            resultList.addAll(subList);
        }

        for(int n:resultList){System.out.print(n+" ");}
    }
}
