package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> train= Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int wagonCapacity=Integer.parseInt(s.nextLine());
        String command=s.nextLine();
        while(!command.equals("end")){
           train= wagonsMethod(wagonCapacity,train,command);
            command=s.nextLine();
        }

        /*for(int t:train){
            System.out.print(t+" ");
        }*/
        //System.out.println(train);
        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));
    }
    public static List<Integer> wagonsMethod(int wagonCapacity, List<Integer> train, String command){
        String[] commandParts=command.split(" ");

        if(commandParts[0].equals("Add")){
            train.add(Integer.parseInt(commandParts[1]));
        }
        else{
            int countOfPassengers=Integer.parseInt(commandParts[0]);
            for(int i=0;i<train.size();i++){
                int freeArea=wagonCapacity-train.get(i);
                if(freeArea>=countOfPassengers){
                    train.set(i, train.get(i)+countOfPassengers);
                    break;
                }
            }
        }
        return train;
    }
}
