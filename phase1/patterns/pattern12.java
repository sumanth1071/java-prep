package phase1.patterns;
import java.util.Scanner;
public class pattern12 {
    public static void pattern(int N) {
        int space = (2*N)-2;
        for(int i = 1 ; i<= N ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j = i ; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
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