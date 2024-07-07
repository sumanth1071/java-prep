import java.util.Scanner;
public class pattern20 {
    public static void pattern(int N) {
        for (int i = 0; i<N; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print('*');
            }
            for(int j = 1; j<2*(N-i); j++) {
                System.out.print(' ');
            }
            for(int j = 0; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
            
        }
        int spaces = 2;
        for(int i = 0 ;i<N-1;i++){
            for(int j = 0;j<N-i-1;j++){
                System.out.print('*');
            }
            for(int j = 0 ;j<=spaces;j++){
                System.out.print(' ');
            }
            for(int j = 0;j<N-i-1;j++){
                System.out.print('*');
            }
            spaces += 2;
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
