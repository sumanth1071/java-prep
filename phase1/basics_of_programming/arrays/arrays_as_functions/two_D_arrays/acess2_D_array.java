package phase1.basics_of_programming.arrays.arrays_as_functions.two_D_arrays;
import java.util.*;
import java.io.*;

public class acess2_D_array {
    public static void main(String args[]) {
        int arr[][] ={
            {0,1},
            {2,4},
            {6,9}
        };
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length-1; j++) {
                System.out.println("arr["+ i +","+ j + "]=" +arr[i][j] + " ");
            } 
        } 
    }    
}
