
import java.util.Scanner;
public class pattern16{
    public static void pattern(int N) {
        for(int i = 0;i<N;i++){
            //char ch= (char)(65+i);
            //Inc case of c++ we can directly convert int into a character
            //but in java we have to use ASCII which will 
            //(char)(ASCII_VALUE+variable) 
            //but we can directly use them in conditions as seen in pattern14
            for(int j = 0;j<=i;j++ ){
                System.out.print((char)(65+i)+" ");
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
        sc.close();
    }
}