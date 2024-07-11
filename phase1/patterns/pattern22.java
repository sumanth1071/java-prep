import java.lang.Math;
import java.util.Scanner;

public class pattern22 {
    public static void pattern(int N) {
        for(int i = 0 ; i<2*N-1 ; i++){
            for(int j = 0 ; j<2*N-1 ; j++){
                int top = i;
                int bottom = 2*N-2-i;
                int left = j;
                int right = 2*N-2-j;
                System.out.print(N-Math.min(Math.min(top, bottom), Math.min(left, right))); 
            }
            System.out.println();
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            System.out.println("Enter N for test case " + (i + 1) + ": ");
            int n = sc.nextInt(); // Read N for each test case
            pattern(n); // Print the star pattern for the current test case
        }
        sc.close();
    }
}