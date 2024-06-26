package phase1.patterns;
import java.util.Scanner;
public class pattern15 {
    public static void pattern( int N) {
       for(int i = 0;i<=N;i++){
            for(char ch ='A'; ch<'A'+N-i;ch++){
            //This much more similar to the pattrn 14 but here we print the 
            //characters in reverse order so the rows would be like
            //A + N-i which is 
            //A + N-0 = ABCDE
            //A + N-1 = ABCD
            //A + N-2 = ABC and it the values decreases as it goes.
                System.out.print(ch+" ");
            }
            System.out.println();
        } 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<=t; i++) {
            int n = sc.nextInt();
            pattern(n);
        } 
    }
    
}