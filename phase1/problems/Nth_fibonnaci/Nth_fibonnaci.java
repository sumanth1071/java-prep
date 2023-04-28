 package phase1.problems.Nth_fibonnaci;
import java.util.Scanner;
import java.io.*; 

public class Nth_fibonnaci{
    public static int fibonacciNumber(int n){
        // Write your code here.
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibonacciNumber(n-1)+fibonacciNumber(n-2);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long result=fibonacciNumber(num);
        System.out.println(result);
    }
}

 /*
    Time complexity: O(2^N)
    Space complexity: O(N) 

    Where 'N' reprents the "Nth" number .
*/

// public class Nth_fibonnaci {
//     public static int fibonacciNumber(int n) {
//         int mod = (int) 1e9 + 7;
        
// 		// Base Case.
// 		if (n <= 1){
// 			return n;
// 		}
	
// 		// Recursive call.
// 		return (fibonacciNumber(n - 1) + fibonacciNumber(n - 2)) % mod;    
// 	}
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         long result=fibonacciNumber(num);
//         System.out.println(result);
//         }

// }
 