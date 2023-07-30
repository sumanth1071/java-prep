package phase1.basics_of_programming.arrays.array_problems;

import java.io.*;
import java.util.*;

public class sumof3arrays {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(); 
        int n = scan.nextInt(); 
        int l = scan.nextInt();
        int array_1[] = new int[m];    
        int array_2[] = new int[n];    
        int array_3[] = new int[l];   
        for(int i = 0; i<array_1.length; i++) {
            array_1[i] = scan.nextInt();
        } 
        for(int j = 0; j<array_2.length; j++) {
            array_2[j] = scan.nextInt();
        } 
        for(int g = 0; g<array_3.length; g++) {
            array_3[g] = scan.nextInt();
        }
        int result = 0;
        for(int i = 0; i<array_1.length; i++) {
            result += array_1[i];
        }
        for(int j = 0; j<array_2.length; j++) {
            result += array_2[j];
            
        }       
        for(int g = 0; g<array_3.length; g++) {
            result += array_3[g];
            
        }     
        System.out.println(result);   
    }
}


