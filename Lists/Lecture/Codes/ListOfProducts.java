package Lists.Lecture.Codes;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int countProducts=Integer.parseInt(s.nextLine());
        List<String> products=new ArrayList<>();

        for(int i=1;i<=countProducts;i++){
            String productName=s.nextLine();
            products.add(productName);
        }

        //sort -> сортира елементите на дадена колекция (масив/лист) в ascending order (нарастващ ред);
        Collections.sort(products);
        int num=1;
        /*for(String pr:products){

            System.out.printf("%d.%s%n", num, pr);
            num++;
        }*/

        for(int i=0;i<products.size();i++){
            System.out.printf("%d.%s%n", i+1, products.get(i));
        }


    }
}
