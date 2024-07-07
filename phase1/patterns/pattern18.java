import java.util.Scanner;
public class pattern18 {
    // Method to print a specific pattern up to N lines
    public static void pattern(int N) {
        // Outer loop: Runs N times, once for each line of the pattern
        for (int i = 0; i < N; i++) {
            // Inner loop: Prints characters from 'E'-i to 'E', creating the pattern's line
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                // Prints the character followed by a space for formatting
                System.out.print(ch + " ");
            }
            // Moves to the next line after printing each line of the pattern
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