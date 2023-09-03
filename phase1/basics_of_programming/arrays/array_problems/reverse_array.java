package phase1.basics_of_programming.arrays.array_problems;
import java.util.ArrayList;
import java.util.Scanner;

public class reverse_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n); 
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            arr.add(s);
        } 
        reverse_array(arr, m+1, n-1);
        System.out.println(arr);
    }
    
    public static void reverse_array(ArrayList<Integer> arr, int start, int end) {
        while(start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            end--;
            start++;
        }
    }   
}
