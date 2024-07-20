import java.util.Scanner;

public class pattern20 {
    /**
     * Prints a symmetrical star pattern for a given number N.
     * The pattern consists of an upper half and a lower half, forming a diamond shape.
     * 
     * @param N The size of the pattern to print.
     */
    public static void Pattern(int N) {
        // Upper half of the pattern
        for (int i = 1; i <=N; i++) {
            // Print left stars: Increasing number of stars from 1 to N
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // Print spaces: Decreasing number of spaces to form the diamond shape
            for (int j = 0; j < 2*N-2*i; j++) {
                System.out.print("  ");
            }
            // Print right stars: Mirroring the left stars to complete the upper half
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after completing one row
        }
        // Lower half of the pattern
        for (int i=1; i<N; i++) {
            // Print left stars: Decreasing number of stars from N-1 to 1
            for (int j = 0; j <N-i; j++) {
                System.out.print("* ");
            }
            // Print spaces: Increasing number of spaces to maintain the diamond shape
            for (int j = 0; j < 2*i; j++) {
                System.out.print("  ");
            }
            // Print right stars: Mirroring the left stars to complete the lower half
            for (int j = 0; j <N-i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after completing one row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            System.out.println("Enter N for test case " + (i + 1) + ": ");
            int n = sc.nextInt(); // Read N for each test case
            Pattern(n); // Print the star pattern for the current test case
        }
        sc.close(); // Close the scanner to prevent resource leak
    }
}