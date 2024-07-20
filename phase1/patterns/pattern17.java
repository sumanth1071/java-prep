
import java.util.Scanner;
public class pattern17{
    public static void pattern(int N) {
        for(int i = 0;i<N;i++){
            for(int j = 0 ; j<N-i-1; j++){
                System.out.print(" ");
            }
            // Initialize the character to print
            char ch = 'A';

            // Calculate the breakpoint for character increment/decrement
            // The breakpoint is i + 1
            int breakpoint = i + 1;

            // Loop through each character in the row
            for (int j = 1; j <= 2 * i + 1; j++) {
                // Print the character
                System.out.print(ch);

                // Increment the character if the current position is less than the breakpoint
                // This creates the "ascending" pattern
                if (j < breakpoint) {
                    ch++;
                }
                // Decrement the character if the current position is greater than or equal to the breakpoint
                // This creates the "descending" pattern
                else {
                    ch--;
                }
            }
            for(int j = 0 ; j<N-i-1; j++){
                System.out.print(" ");
            }
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