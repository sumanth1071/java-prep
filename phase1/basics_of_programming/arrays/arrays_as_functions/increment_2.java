package phase1.basics_of_programming.arrays.arrays_as_functions;

public class increment_2 {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        increment(arr);// reference to array passed
        for(int i = 0; i<5; i++) {
            System.out.println(arr[i]);
        } 

    }
    public static void increment(int arr[]) {
        int arr1[] = {1,2,3,4,5};
        arr = arr1;
        
        // here we assgined array to another array 
        // so the array in main wont be modified

        for(int i = 0; i<5; i++) {
            arr[i]++;
        } 
    }
}
