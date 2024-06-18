package phase1.patterns;
import java.util.Scanner;
public class pattern11 {
    public static void pattern(int N) {
        int start;
        for(int i= 0 ;i<N;i++){
            start = (i%2==0)?1:0;
            for(int j = 0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
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
        }
    
}
