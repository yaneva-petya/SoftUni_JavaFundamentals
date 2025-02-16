package AssociativeArrays.Exercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new TreeMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junks = new LinkedHashMap<>();

        boolean isLegendaryItemBought = false;

        while (!isLegendaryItemBought) {

            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int index = 0; index <= inputData.length - 1; index += 2) {


                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int existingQuantity = materials.get(material);
                    materials.put(material, existingQuantity + quantity);
                } else {
                    if (junks.containsKey(material)) {
                        int existingQuantity = junks.get(material);
                        junks.put(material, existingQuantity + quantity);
                    } else {
                        junks.put(material, quantity);
                    }
                }


                for (Map.Entry<String, Integer> entry : materials.entrySet()) {

                    if (entry.getValue() >= 250) {
                        isLegendaryItemBought = true;
                        if (entry.getKey().equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (entry.getKey().equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        int newQuantity = entry.getValue() - 250;
                        materials.put(material, newQuantity);
                    }
                }

                if (isLegendaryItemBought) {
                    break;
                }
            }
        }

        materials.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
        junks.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
    }
}