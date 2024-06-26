package phase1.patterns;
import java.util.Scanner;
public class pattern13 {
    public static void pattern(int N) {
        int count = 1;
		//Initially we take a random variable with value 1 as we have to print the first value as 1
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=i;j++){
			//later the count value increases till the j values becomes lesser 
            //than 1 values that means the row values increases the count values also increases
                System.out.print(count+" ");
                count+=1;
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