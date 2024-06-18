package phase1.basics_of_programming.arrays.array_problems;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * java program to find duplicate element in an array
 * 
 * input : [1,3,4,3,1,4,5,6,7]
 * output: [1,3,4]
 * 
 * We are going to use set data structure
 * 
 * Set is an unordered collection of objects in which dupliacte elements can't be contained
 * Set can be implemented by Hashset, Linkedhashset and TreeSet class
 * 
 */

public class duplicate_element {
    public static void main(String args[]) {
        
        int arr[] = {1,2,5,2,1,5,6,7,3};
        Set<Integer> uniquenumber = new HashSet<>();
        boolean isduplicateExist = false;

        for(int i = 0; i<arr.length; i++) {
            
            if (uniquenumber.contains(arr[i])) {
                isduplicateExist = true;
                System.out.println("duplicate element" + " " + arr[i]);    
            } 
            else {
                uniquenumber.add(arr[i]);

            }
        }
        if(!isduplicateExist) {
            System.out.println(-1);
        } 
    
    }
    
    
}
