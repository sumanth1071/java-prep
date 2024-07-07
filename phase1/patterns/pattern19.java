import java.util.Scanner;
public class pattern19{
    public static void pattern(int N) {
        int spaces = 0;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N-i;j++){
                System.out.print('*');
            }
            for(int j = 0;j<spaces;j++){
                System.out.print(' ');
            }
            for(int j = 0;j<N-i;j++){
                System.out.print('*');
            }
            spaces += 2;
            System.out.println();
        }
        for(int i = 0;i<N;i++){
            for(int j = 0;j<=i;j++){
                System.out.print('*');
            }
            for(int j = 0;j<spaces-2;j++){
                System.out.print(' ');
            }
            for(int j = 0;j<=i;j++){
                System.out.print('*');
            }
            spaces -= 2;
            System.out.println();
        }
    
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            pattern(n);
        } 
        sc.close();
    }
}