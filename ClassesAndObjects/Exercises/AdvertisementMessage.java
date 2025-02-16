package ClassesAndObjects.Exercises;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] phrases={
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] events={"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors={
                "Diana","Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities={
          "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd=new Random();

        int n=Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++){
            int index1=rnd.nextInt(phrases.length);
            int index2=rnd.nextInt(events.length);
            int index3=rnd.nextInt(authors.length);
            int index4=rnd.nextInt(cities.length);
           System.out.printf("%s %s %s – %s%n", phrases[index1],events[index2], authors[index3], cities[index4]);
        }
    }
}
