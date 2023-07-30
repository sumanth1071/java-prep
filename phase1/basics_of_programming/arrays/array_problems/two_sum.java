// This question is asked by Google. Given an array of integers, 
// return whether or not two numbers sum to a given target, k.

package phase1.basics_of_programming.arrays.array_problems;

import java.util.Scanner;

public class two_sum {
    public static int[] twosum(int nums[], int target) {
        int result[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        } 
        System.out.println("[" +result[0]+","+result[1]+ "]");
        // System.out.println(result[1]);
    
        return result;
    }
    public static void main(String args[]) {
        
        Scanner Scan = new Scanner(System.in);
        int a = Scan.nextInt();
        int nums[] = new int[a];
        int target = Scan.nextInt();
        
        for(int i = 0; i<nums.length; i++) {
            nums[i] = Scan.nextInt();
        }  
        twosum(nums, target);   
    }
}
