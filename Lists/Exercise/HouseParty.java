package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int countOfPeople=Integer.parseInt(s.nextLine());
        List<String> names=new ArrayList<>();
        for(int i=0;i<countOfPeople;i++){
            String command=s.nextLine();// {name} is going! OR {name} is not going!
            String[] partsOfCommand=command.split(" ");

            if(partsOfCommand[2].equals("going!")){
                if(names.contains(partsOfCommand[0])){
                    System.out.printf("%s is already in the list!%n", partsOfCommand[0]);
                }
                else{
                    names.add(partsOfCommand[0]);
                }
            }
            else if(partsOfCommand[2].equals("not")){
                if(names.contains(partsOfCommand[0])){
                    names.remove(partsOfCommand[0]);
                }
                else{
                    System.out.printf("%s is not in the list!%n", partsOfCommand[0]);
                }
            }

        }

        for(String n:names){
            System.out.println(n);
        }
    }
}
