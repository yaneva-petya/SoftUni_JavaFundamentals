package Methods.Exercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        matrix(n);
    }

    public static void matrix(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf(n+" ");

            }
            System.out.println();
        }
    }
}
