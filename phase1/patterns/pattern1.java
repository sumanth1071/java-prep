
import java.util.Scanner;
class Pattern1 {
    public static void pattern(int N) {
        for (int i = 0; i<N ; i++) {
            // here outer loop starts with first row
            for (int j = 0; j<N ; j++) {
        // here the inner loop starts and enters into the 
        // colums
                System.out.print("*");
            }
            // after completing inner loop have to move to 
            // next line in this case we use line break (ln)
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for( int i = 0;i<t;t++){
            int N = sc.nextInt();
            pattern(N);
        }
    }   
}