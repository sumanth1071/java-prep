package phase1.basics_of_programming.arrays;
import java.util.*;
import java.io.*;
public class create_array {
    public static void main(String args[]) {
        int arr[] = new int[5];
        
        // initializing array of size 5
        Scanner Scan = new Scanner(System.in);
        
        // printing array using for loop
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = Scan.nextInt();
            System.out.println(arr[i]);
        }

        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i]);
        }

        for(int i : arr) {
            // special type of for loop only used for traversing array
            System.out.print(i);
        }
    }
}

