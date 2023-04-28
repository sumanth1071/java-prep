package phase1.problems;

import java.util.Scanner;

public class set_bits {
    public static int getbits(int n) {
        int count = 0;
        while(n>0) {
            int bits = n&1;
            if(bits == 1)
            {
            count++;
            n=n>>1;
        }
        else
        n=n>>1;
            
            
        }
    return count; 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getbits(n));
    }
}
