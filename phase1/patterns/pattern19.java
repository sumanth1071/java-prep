import java.util.Scanner;

public class pattern19 {
    /**
     * This method prints a specific pattern for a given number N.
     * The pattern consists of two parts: an upper half and a lower half.
     * In the upper half, the number of stars decreases while spaces in the middle increase.
     * In the lower half, the number of stars increases while spaces in the middle decrease.
     * 
     * @param N The size of the pattern to print.
     */
    public static void pattern(int N) {
        // int spaces = 0; // Initial number of spaces in the middle is set to 0.

        // Upper half of the pattern
        for (int i = 0; i < N; i++) {
            // Print left stars: Decreasing number of stars from N to 1.
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            // Print spaces: Increasing number of spaces in the middle.
            // Initially, there are no spaces, but the number increases by 2 in each iteration.
            for (int j = 0; j < 2*i; j++) {
                System.out.print("  ");
            }
            // Print right stars: Same as left stars, creating a symmetrical pattern.
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            spaces += 2; // Increase the number of spaces by 2 for the next row.
            System.out.println(); // Move to the next line after completing one row.
        }
        
        // Lower half of the pattern
        for (int i = 1; i <=N; i++) {
            // Print left stars: Increasing number of stars from 1 to N.
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // Print spaces: Decreasing number of spaces in the middle.
            // The number of spaces decreases by 2 in each iteration, starting from the last number of spaces in the upper half.
            for (int j = 0; j < 2*N-2*i; j++) {
                System.out.print("  ");
            }
            // Print right stars: Same as left stars, maintaining symmetry.
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            spaces -= 2; // Decrease the number of spaces by 2 for the next row.
            System.out.println(); // Move to the next line after completing one row.
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
     // Close the scanner to prevent resource leaks.
    }
}