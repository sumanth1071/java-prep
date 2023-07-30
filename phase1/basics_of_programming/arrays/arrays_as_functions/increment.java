package phase1.basics_of_programming.arrays.arrays_as_functions;

public class increment {
    public static void increment(int arr[]) {
        for(int i = 0 ; i<5 ; i++) {
            arr[i]++;
            //we are modifying array which is belongs to main
            //so the array in main also be modified
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        char str[] = {'a','b','c'};
        System.out.println(str);
        // System.out.println(arr);
        // System.out.print(arr[0] + " ");////
        // increment(arr);
        // reference to the array passed
        for(int i = 0;i<5;i++) {
            System.out.println(arr);
            //prints only address of the array
            System.out.println(arr[i] + " ");
        }
    }
}
