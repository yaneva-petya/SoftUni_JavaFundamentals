package AssociativeArrays.Exercise;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        Map<String, String> parkingInfo=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            String input=s.nextLine();
            String[] data=input.split(" ");

            String position=data[0];
            String name=data[1];

            switch (position){
                case "register":{
                    String carNum=data[2];
                    if(parkingInfo.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingInfo.get(name));
                    }else {
                        parkingInfo.put(name, carNum);
                        System.out.printf("%s registered %s successfully%n", name, parkingInfo.get(name));
                    }
                    break;
                }
                case "unregister":{
                    if(!parkingInfo.containsKey(name)){
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    else{
                        System.out.printf("%s unregistered successfully%n", name);
                        parkingInfo.remove(name);
                    }
                    break;
                }
            }

        }

        for(Map.Entry<String, String > entry: parkingInfo.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
