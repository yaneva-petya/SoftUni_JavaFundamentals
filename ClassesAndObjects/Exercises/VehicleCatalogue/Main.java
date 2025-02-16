package ClassesAndObjects.Exercises.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        List<Car> carList=new ArrayList<>();
        List<Truck> truckList=new ArrayList<>();

       String input=s.nextLine();

       while(!input.equals("End")){
           String[] parts=input.split(" ");
           String type=parts[0];
           String model=parts[1];
           String color=parts[2];
           int horsepower=Integer.parseInt(parts[3]);

           if(type.equals("car")){
               Car car=new Car(type,model,color,horsepower);
               carList.add(car);
           }
           else{
               Truck truck=new Truck(type,model,color,horsepower);
               truckList.add(truck);
           }
           input=s.nextLine();
       }

       String searchModel=s.nextLine();
       int countOfCars=0, countOfTrucks=0;
       int sumOfCarsPower=0, sumOfTrucksPower=0;

       while (!searchModel.equals("Close the Catalogue")){
          for(Car car:carList){
              if(searchModel.equals(car.getModel())){

                 System.out.printf("Type: Car%n", car.getType());
                 System.out.printf("Model: %s%n", car.getModel());
                 System.out.printf("Color: %s%n", car.getColor());
                 System.out.printf("Horsepower: %d%n", car.getHorsepower());
              }
          }

          for (Truck truck:truckList){
              if(searchModel.equals(truck.getModel())){

                  System.out.printf("Type: Truck%n", truck.getType());
                  System.out.printf("Model: %s%n", truck.getModel());
                  System.out.printf("Color: %s%n", truck.getColor());
                  System.out.printf("Horsepower: %d%n", truck.getHorsepower());
              }
          }

           searchModel=s.nextLine();
       }
       for(Car car:carList){
           sumOfCarsPower+=car.getHorsepower();
       }

       for (Truck truck:truckList){

           sumOfTrucksPower+=truck.getHorsepower();
       }
       if(carList.size()>0) {
           System.out.printf("Cars have average horsepower of: %.2f.%n", (double)sumOfCarsPower/carList.size());
       }
       else{
           System.out.printf("Cars have average horsepower of: 0.00.%n");
       }

       if(truckList.size()>0) {
           System.out.printf("Trucks have average horsepower of: %.2f.%n", (double) sumOfTrucksPower / truckList.size());
       }
       else {
           System.out.printf("Trucks have average horsepower of: 0.00.%n");
       }
    }
}
