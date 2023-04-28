package phase1.problems;
import java.util.*;
import java.io.*;
public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int fact = 1;
        if(a>0) {
            for(;i<=a;i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
        else if(a==0) {
            System.out.println(1);
        }
        else {
            System.out.println("error");
        }

    }
}
