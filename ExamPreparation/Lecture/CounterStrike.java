package ExamPreparation.Lecture;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int initialEnergy=Integer.parseInt(s.nextLine());


        boolean isOver=false;
        int count=0;
        String command=s.nextLine();
        while(!command.equals("End of battle")){

            int distance=Integer.parseInt(command);
            initialEnergy-=distance;

            if(initialEnergy<0){
                initialEnergy+=distance;
                isOver=true;
                break;
            }
            else{
                count++;
            }

            if(count%3==0){
                initialEnergy+=count;
            }

            command=s.nextLine();
        }

        if(isOver){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count,initialEnergy);
        }
        else{
            System.out.printf("Won battles: %d. Energy left: %d", count,initialEnergy);
        }
    }
}
