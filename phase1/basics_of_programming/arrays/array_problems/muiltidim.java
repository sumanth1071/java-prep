package phase1.basics_of_programming.arrays.array_problems;

public class muiltidim {
    public static void main(String args[]) {
        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        // arr 1st row contains 1 element [0]
        // arr 2nd row contains 2 element [0,1]
        // arr 3rd row contains 3 element [0,1,2]
        
        int sum = 0;
        for(int i = 0; i<3; ++i) {
            for(int j = 0; j< i+1; ++j) {
                arr[i][j] = j+1;
            // the output will be 
            // 1 , (1,2) ,(1,2,3)
            } 
        }
        for(int i = 0; i<3; ++i) {
            for(int j = 0; j<i+1; ++j) {
                sum += arr[i][j];
                
        System.out.println(sum);
            } 
        }  
    }
}
