package ClassesAndObjects.Exercises.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Person> personList=new ArrayList<>();
        int n=Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++){
            String input=s.nextLine();
            String[] parts=input.split(" ");
            String name=parts[0];
            int age=Integer.parseInt(parts[1]);
            Person p=new Person(name, age);
            personList.add(p);
        }

        for (Person p:personList){
            if(p.getAge()>30){
                System.out.printf("%s - %d%n", p.getName(), p.getAge());
            }
        }
    }
}
