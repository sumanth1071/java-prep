
package phase1.problems.Nth_fibonnaci;
import java.util.Scanner;
import java.io.*;

public class Nth_fibonnaci2{
    public static int fibonaccinumber(int n) {
        int n1 = 0;
        int n2 = 1;
        int result = 0;
        int mod = ((int)Math.pow(10, 9))+7;
        for(int i = 2;i<=n;i++){
            result = n1+n2;
            n1 = n2;
            n2 = result;
            if(n2>=mod){

                n2-=mod;
            }
            
        }
        return n2;
    }
        
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long res=fibonaccinumber(num);
        System.out.println(res);
    }
}
