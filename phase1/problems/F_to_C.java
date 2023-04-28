package phase1.problems;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class F_to_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        for(int i=s;i<=e;i+=w) {
            double c = (i-32)*5/9;
            
            double answer = c<0?(Math.ceil(c)):(Math.floor(c));
            System.out.println(i+"\t"+(int)answer);
            // if(c<0)
            // System.out.println(i+"\t"+(int)Math.ceil(c));
            // else
            // System.out.println(i+"\t"+(int)Math.floor(c));
        }

    }
}

