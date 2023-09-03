package phase1.basics_of_programming.arrays.array_problems;

import java.util.Scanner;

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
                if(arr[i]+arr[j] == sum)
                count++;
            } 
        }
        System.out.println(count); 
    }
    
}
