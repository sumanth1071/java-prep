package phase1.problems.Nth_fibonnaci;

import java.util.Scanner;
import java.io.*;

public class Nth_fibonnaci2 {
    public static int fibonacciNumber(int n) {
        // initiate variables
        int n1 = 0;
        int n2 = 1;
        int result = 0;
        // now create mod to make sure that the value does not exceedes 10^9+7
        int mod = ((int)Math.pow(10, 9))+7;
        // now create loop 
        for(int i = 2;i<=n;i++) {
            // n = (n-1) + (n-2)
            result = n1+n2;
            n1 = n2;
            n2 = result;
            // subtracting with mod
            // to ensure the final result should stay in the range integer
            if(n2 >= mod){
                n2-=mod;
            }
        }
        return n2;
    }
}
