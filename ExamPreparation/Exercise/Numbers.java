package ExamPreparation.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> num= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int count=0;
        int sum=0;
        for(int i=0;i<num.size();i++){
            sum+=num.get(i);
        }
        int size= num.size();
        double average=(double)sum/size;
        //System.out.println(average);
        Collections.sort(num);
        Collections.reverse(num);

       List<Integer> newList=new ArrayList<>();
        for(int i=0;i<num.size();i++){
            int obj=num.get(i);
            if(obj>average){
                newList.add(obj);
                count++;
            }

            if(count>=5){break;}
        }

        if(count==0){System.out.println("No");}

        for(int n:newList){
            System.out.print(n+" ");
        }
    }
}
