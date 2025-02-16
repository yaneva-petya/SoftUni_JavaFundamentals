package ClassesAndObjects.Lecture;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        BigInteger result=new BigInteger(String.valueOf(1));

        for(int i=2;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));

        }
        System.out.println(result);
    }
}
