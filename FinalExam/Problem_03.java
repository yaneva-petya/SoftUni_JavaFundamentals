package FinalExam;

import java.util.*;
import java.util.*;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> guestMeals = new LinkedHashMap<>();
        int unlikedMealsCount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }

            String[] parts = input.split("-");
            String action = parts[0];
            String guest = parts[1];
            String meal = parts[2];

            switch (action) {
                case "Like":

                    guestMeals.putIfAbsent(guest, new ArrayList<>());
                    List<String> meals = guestMeals.get(guest);

                    if (!meals.contains(meal)) {
                        meals.add(meal);
                    }
                    break;

                case "Dislike":

                    if (!guestMeals.containsKey(guest)) {
                        System.out.println(guest + " is not at the party.");
                    } else {
                        List<String> likedMeals = guestMeals.get(guest);
                        if (!likedMeals.contains(meal)) {
                            System.out.println(guest + " doesn't have the " + meal + " in his/her collection.");
                        } else {
                            likedMeals.remove(meal);
                            unlikedMealsCount++;
                            System.out.println(guest + " doesn't like the " + meal + ".");
                        }
                    }
                    break;
            }
        }


        for (Map.Entry<String, List<String>> entry : guestMeals.entrySet()) {
            String guest = entry.getKey();
            List<String> meals = entry.getValue();
            if (!meals.isEmpty()) {
                System.out.println(guest + ": " + String.join(", ", meals));
            } else {
                System.out.println(guest + ": ");
            }
        }


        System.out.println("Unliked meals: " + unlikedMealsCount);
    }
}
