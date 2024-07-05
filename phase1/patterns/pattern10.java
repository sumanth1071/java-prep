
import java.util.Scanner;
public class pattern10 {
    public static void pattern(int N) {
        for(int i = 0 ; i<=2*N-1;i++){
            int stars=(i<N)?i:(2*N-i);
            for(int j = 1 ; j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i = 0 ; i<=t;i++){
            int n = sc.nextInt();
            pattern(n);
        }
    }
}