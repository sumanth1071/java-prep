
import java.util.Scanner;
public class pattern17{
    public static void pattern(int N) {
        for(int i = 0;i<N;i++){
            for(int j = 0 ; j<N-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            // we use a breakpoint which breaks at the middle value
            // and starts the iteration by decrementing the characters
            // (2*0+1)/2 = 0.5 nearly 1
            // (2*1+1)/2 = 3/2 = 1.5 nearly after 2nd char the decrement starts
            // (2*5+1)/2 = 11/2 = 5.5 ~ 6 so after 6th char decrement starts
            for(int j =1 ; j<=2*i+1 ; j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j = 0 ; j<N-i-1; j++){
                System.out.print(" ");
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