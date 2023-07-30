package phase1.basics_of_programming.arrays.arrays_as_functions;

public class array_return_usingfunction {
    public static void main(String args[]) {
        int A[] = numbers();
        // function is passed as a reference
        for(int i = 0; i<3; i++) {
            System.out.print(A[i] + " ");
        } 
    }
    public static int[] numbers() {
        int A[] = new int[3];
        A[0] = 3;
        A[1] = 4;
        A[2] = 5;
        return A;
    }
}
