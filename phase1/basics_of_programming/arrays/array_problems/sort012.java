package phase1.basics_of_programming.arrays.array_problems;

import java.util.Scanner;
// this is the dutch national flag problem
// this is also known as the 0-1-2 sort problem
// this is also known as the 3-way partitioning problem
// time complexity is O(n) because we are traversing the array only once
// space complexity is O(1) because we are not using any extra space

public class sort012 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    sort0112(arr);
    for(int i = 0; i<arr.length; i++) {
        System.out.print(arr[i] + " ");
    }   
    }

    public static void sort0112(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high) {
            switch(arr[mid]) {
                case 0:
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                int temp1 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp1;
                high--;
                break;
                
            }
        }
    }
    
}
