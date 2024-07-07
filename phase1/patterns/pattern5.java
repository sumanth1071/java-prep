
import java.util.Scanner;
public class pattern5{
    public static void pattern(int N) {
        for(int i = 1; i<=N; i++) {
            for(int j = N; j>=i; j--) {
                System.out.print("* ");
            } 
            System.out.println();
        } 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<=t; i++) {
            int n = sc.nextInt();
            pattern(n);
        } 
        sc.close();
    }
}