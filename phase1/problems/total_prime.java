package phase1.problems;

import java.util.Scanner;

public class total_prime {
    public  int prime(int a, int b) {
        int count = 0;
        int flag=0;
        for (int i  = a;i<b;i++)
        {
            for(int j = 2;j<b;j++)
            {
                if(i%j==0 && i!=j) 
                {
                    flag=0;
                    break;
                }
                if(i==j)
                    flag=1;
            }
            
            count+=flag;
            flag=0;
        }
        return count;
    }
    public static void main(String args[]) {
        total_prime obj = new total_prime();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();        
        int b = sc.nextInt(); 
        System.out.println(obj.prime(a, b));       
    }
}
