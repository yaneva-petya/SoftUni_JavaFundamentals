package TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.*;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BigInteger firstNum=new BigInteger(s.nextLine());
        int secondNum=Integer.parseInt(s.nextLine());

        System.out.println(firstNum.multiply(BigInteger.valueOf(secondNum)));

    }
}
