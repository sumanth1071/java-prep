package phase1.basics_of_programming.arrays.array_problems;

import java.util.Scanner;


public class find_element {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scan.nextInt();
        } 
        int x = scan.nextInt();
        int y = scan.nextInt();
        int element1 = search(arr,arr.length,x,y);
        String result = (element1 == -1)? "both values not present in the array" : "both values are  present in the list";
        System.out.println(result);
    
}
    static int search(int arr[],int n ,int x,int y) {
        for(int i = 0;i<n;i++) {
            for(int j = 0; j<n; j++) {
                if(arr[i]==x && arr[j]==y)
                return i;
            } 
            
        }
        return -1;

    }
}
