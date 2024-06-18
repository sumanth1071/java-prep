package phase1.basics_of_programming.arrays.array_problems;

import java.util.Scanner;
/**
 * 
 * Find the pairs with the given sum using array
 * 
 * Given array is of size n
 * we need to find the pairs which are equal to the sum k
 * if no such pair is to be found then print -1
 * 
 * input : [1,2,4,5,2,3]
 *          sum = 3
 * 
 * output : [1,2]
 *          [1,2]
 * 
 */
public class pairofsums_in_array {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();    
        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = scan.nextInt();
        int count = 0;
        // initialize result
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                if(arr[i]+arr[j] == sum) {
                    System.out.println("Pair ( " + arr[i] +" , "+ arr[j] + " )");
                    count++;
                }
            } 
        }
        System.out.println(count); 
    }
    
}
