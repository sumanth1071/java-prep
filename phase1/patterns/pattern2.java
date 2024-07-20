
import java.util.Scanner;
class Pattern2 {
    public static void Pattern(int N) {
        for (int i = 0; i <N ; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print("* ");
            } 
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        // input total no of pattern
        for(int j = 0; j<t; j++) {
            int n =sc.nextInt();
            // what should be the pattern length
            Pattern(n);
        } 
        sc.close(); // close the scanner
    }
    
    
}