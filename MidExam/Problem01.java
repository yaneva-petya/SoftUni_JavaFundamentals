package MidExam;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int daysOfAdventure = Integer.parseInt(s.nextLine());
        int numberOfAdventurers = Integer.parseInt(s.nextLine());
        double initialEnergy = Double.parseDouble(s.nextLine());
        double waterPerPersonPerDay = Double.parseDouble(s.nextLine());
        double foodPerPersonPerDay = Double.parseDouble(s.nextLine());

        double totalWater = daysOfAdventure * numberOfAdventurers * waterPerPersonPerDay;
        double totalFood = daysOfAdventure * numberOfAdventurers * foodPerPersonPerDay;

        boolean enoughEnergy = true;

        for (int i = 1; i <= daysOfAdventure; i++) {
            double dailyEnergyLoss = Double.parseDouble(s.nextLine());
            initialEnergy -= dailyEnergyLoss;

            if (initialEnergy <= 0) {
                enoughEnergy = false;
                break;
            }

            if (i % 2 == 0) {
                initialEnergy += initialEnergy * 0.05;
                totalWater -= totalWater * 0.3;
            }

            if (i % 3 == 0) {
                initialEnergy += initialEnergy * 0.1;
                totalFood -= totalFood / numberOfAdventurers;
            }
        }

        if (enoughEnergy) {
            System.out.printf("You are ready for the quest. You will be left with %.2f energy!%n", initialEnergy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.%n", totalFood, totalWater);
        }

    }
}
