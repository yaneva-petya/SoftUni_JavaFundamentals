package ClassesAndObjects.Lecture;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] words=s.nextLine().split(" ");
        Random rnd=new Random();
        for(int i=0;i< words.length;i++){
            int randomIndex=rnd.nextInt(words.length);//it is a random index
            String temp=words[i];
            words[i]=words[randomIndex];
            words[randomIndex]=temp;
        }

        System.out.println(String.join(System.lineSeparator(),words));

    }
}
