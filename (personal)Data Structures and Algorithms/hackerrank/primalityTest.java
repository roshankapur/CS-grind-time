package hackerrank;

import java.math.*;
import java.util.*;


public class primalityTest {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);
        BigInteger N = new BigInteger(getVal.nextLine());

        if(N.isProbablePrime(1)){
            System.out.println("prime");
        }else System.out.println("not prime");
    }
}
