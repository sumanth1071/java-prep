import java.util.Scanner;

public class pattern21 {
    // Method to print a square pattern with stars on the border and spaces inside
    public static void pattern(int N) {
        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<N ; j++){
                // Print stars at the border of the square
                if(i==0 || i==N-1 || j==0 || j==N-1){
                    System.out.print("* ");
                } else {
                    // Print spaces inside the square
                    System.out.print("  ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the number of test cases
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            // Prompt for N for each test case
            System.out.println("Enter N for test case " + (i + 1) + ": ");
            int n = sc.nextInt(); // Read N for each test case
            // Print the star pattern for the current test case
            pattern(n);
        }
        // Close the scanner to prevent resource leak
        sc.close();
    }
}