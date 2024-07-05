
import java.util.Scanner;
public class pattern9{
    public static void pattern(int N){
        for(int i = 0 ; i<N;i++){
            for(int j = 0; j<N-i-1; j++) {
                System.out.print(" ");
            } 
            for(int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            } 
            for(int j = 0; j<N-i-1; j++) {
                System.out.print(" ");
            }
        
            System.out.println();
        }
    } 
    public static void patterntwo(int N) {
        for(int i = 0 ; i<N;i++){
            for(int j = 0; j<i; j++) {
                System.out.print(" ");
            } 
            for(int j = 0; j<(2*N)-(2*i+1); j++) {
                System.out.print("*");
            } 
            for(int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i= 0; i<=t ;i++){
            int n = sc.nextInt();
            pattern(n);
            patterntwo(n);
        }
    }
}