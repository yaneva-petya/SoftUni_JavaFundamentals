package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        Map<String, Integer> productsByQuantity=new LinkedHashMap<>();
        Map<String, Double> productsByPrice=new LinkedHashMap<>();

        String name="";
        double price=0.0;
        int quantity=0;

        while(!input.equals("buy")){
            String[] info=input.split("\\s+");
            name=info[0];
            price=Double.parseDouble(info[1]);
            quantity=Integer.parseInt(info[2]);

            if(productsByQuantity.containsKey(name)){
                int currentQuantity=productsByQuantity.get(name);
                productsByQuantity.put(name, currentQuantity+quantity);
                if(productsByPrice.get(name)!=price){
                    productsByPrice.put(name,price);
                }
            }
            else{
                productsByQuantity.put(name,quantity);
                productsByPrice.put(name, price);
            }
            price=0;
            quantity=0;
            input=s.nextLine();
        }

        for(String productName: productsByQuantity.keySet()){
            int finalQuantity=productsByQuantity.get(productName);
            double finalPrice=productsByPrice.get(productName);
             System.out.printf("%s -> %.2f%n", productName, finalPrice*finalQuantity);

        }
    }
}
