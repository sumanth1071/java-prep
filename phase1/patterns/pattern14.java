
import java.util.Scanner;
public class pattern14 {
    public static void pattern(int N) {
        for(int i = 0;i<N;i++){
            for(char ch = 'A';ch<='A'+i;ch++){
//In ASSIC values character + numbeer increases the value of the char but not joins the number with it.
//here the value of char A increase as per the rows if the row is 5 the characters 
//should be printed like A B C D E same for such numbers also
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