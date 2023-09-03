package phase1.basics_of_programming.arrays.array_problems;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class rotate_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i = 0;i<n;i++) {
            int s = sc.nextInt();
            arr.add(s);
        }
        System.out.println(arr);
        // int m = sc.nextInt();
        rotate_array(arr, 2);
        System.out.println(arr);
        

    }
    static void reverse_array(ArrayList<Integer> arr, int start , int end) {
        while (start<end) {
            int temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            end--;
            start++;
        }
    }
    static void rotate_array(ArrayList<Integer> arr,int m) {
        m = m%arr.size();
        // System.out.println(m);
        if(m<0) {
            m = m+arr.size();
        }
        reverse_array(arr, 0, m-1);
        reverse_array(arr, m, arr.size()-1);
        reverse_array(arr, 0, arr.size()-1);
    }
    
}
