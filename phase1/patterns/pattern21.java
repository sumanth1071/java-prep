import java.util.Scanner;
public class pattern21 {
    public static void pattern(int N) {
        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<N ; j++){
                if(i==0 || i==N-1 || j==0 || j==N-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
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
        sc.close(); // Close the scanner to prevent resource leak
    }
    
}
