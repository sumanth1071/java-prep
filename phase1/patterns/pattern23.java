import java.util.Scanner;
public class pattern23 {
    public static void pattern(int N) {
        for(int i = 0; i<N; i++) {
            char ch = (char)('A'+N-1);
            // we start with 'A' because if we give the
            //input value as 1 we have to get 'A'
            // if the input value is 3 we get 'C'
            // if the input value is 4 we get 'D'
            // if the input value is 5 we get 'E'
            // and so on.
            for(int j = 0; j<=i; j++) {
                System.out.print((char)(ch-j)+" ");
                // we decrement 'ch' by 'j' to get the pattern in reverse order.
                // we add 'j' to get the pattern in increasing order.
            }
            System.out.println();
            // and so on.
            for(int j = 0; j<=i; j++) {
                System.out.print((char)(ch-j)+" ");
                // we decrement 'ch' by 'j' to get the pattern in reverse order.
                // we add 'j' to get the pattern in increasing order.
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
        sc.close(); // Close the scanner to prevent resource leak
    }
    
}
