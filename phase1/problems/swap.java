package phase1.problems;
import java.util.*;
import java.io.*; 

public class swap {
    public static void main(String args[]) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        int c;

        c=a;
        a=b;
        b=c;
        
        System.out.println("the swapped values are");
        System.out.println(a);
        System.out.println(b);
    }
}