package phase1.basics_of_programming.arrays.array_problems;
import java.util.ArrayList;
import java.util.Scanner;

public class reverse_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n); 
        // array size is n but we can add n elements in it
        int m = sc.nextInt();
        // m is the index from where we have to reverse the array
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            arr.add(s);
            // adding elements to the array
        } 
        reverse_array(arr, m+1, n-1);
        // reversing the array from m+1 to n-1
        System.out.println(arr);
        // printing the array
    }
    
    public static void reverse_array(ArrayList<Integer> arr, int start, int end) {
        while(start < end) {
            int temp = arr.get(start);
            // swapping the elements
            arr.set(start, arr.get(end));
            // setting the value of the element at index start to the value of the element at index end
            arr.set(end, temp);
            // setting the value of the element at index end to the value of the element at index start
            end--;
            // decrementing the value of end
            start++;
            // incrementing the value of start
        }
    }   
}
