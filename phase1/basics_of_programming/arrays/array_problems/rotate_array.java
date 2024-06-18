package phase1.basics_of_programming.arrays.array_problems;

import java.util.Scanner;

public class rotate_array {
    public static void main(String args[]) {
    
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++) {
            System.out.print(a[i] + " "); 
    
        } 
        int m  = sc.nextInt();
        rotate_array(a, m);
        for(int i = 0; i<n; i++) {
            System.out.print(a[i] + " "); 
    
        } 
    }

    public static void reverse_array(int[] arr , int start , int end) {
        while(start<end) {
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;

        }
    }
    public static void rotate_array(int[] arr ,int m) {
        m = m%arr.length;

        if (m<0) {
            m = m+arr.length;
        }

        reverse_array(arr, 0,m-1 );
        reverse_array(arr, m,arr.length-1 );
        reverse_array(arr, 0,arr.length-1 );
    }
    
}
