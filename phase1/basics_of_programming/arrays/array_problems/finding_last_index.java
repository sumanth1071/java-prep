package phase1.basics_of_programming.arrays.array_problems;

import java.util.Scanner;

public class finding_last_index {
public static void main(String args[]) {

    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int val = sc.nextInt();
		int result = -1;
		for(int j = 0;j<n;j++) {
			if(arr[j]== val) {
                result=j;
                // if the value is found break the condition

            }
		}
		System.out.println(result);
    }
}	

