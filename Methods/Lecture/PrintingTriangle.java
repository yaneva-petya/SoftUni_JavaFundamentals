package Methods.Lecture;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());

        printingTriangle(n);
    }

    public static void printingTriangle(int n){

        for(int row=1;row<=n;row++){
            for(int colum=1;colum<=row;colum++){
                System.out.print(colum+" ");
            }
            System.out.println();
        }

        for(int row=n-1;row>=1;row--){
            for(int colum=1;colum<=row;colum++)
            {
                System.out.print(colum+" ");
            }
            System.out.println();
        }


    }
}
