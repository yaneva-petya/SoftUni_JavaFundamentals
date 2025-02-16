package ExamPreparation.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> num= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=s.nextLine();
        int count=0;
        while(!command.equals("End")){
            int index=Integer.parseInt(command);

            boolean isValid=index>=0 && index<=num.size()-1;

            if(!isValid){
                command=s.nextLine();
                continue;
            }

            count++;
            int object = num.get(index);
            num.set(index,-1);


           for(int i=0;i<num.size();i++){
                int newObject=num.get(i);
                if(newObject!=-1){

                    if(newObject<=object){
                        num.set(i, newObject+object);
                    }
                    else{
                        num.set(i, newObject-object);
                    }
                }

           }

            command=s.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", count);
        for(int n:num){
            System.out.print(n+" ");
        }
    }
}
