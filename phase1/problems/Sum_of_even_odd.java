package phase1.problems;
import java.util.Scanner;


public class Sum_of_even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long oddsum=0,evensum=0;
        while(i!=0) {
        long extract = i%10;
        i=i/10;
        long answer = extract%2==0?(evensum+=extract):(oddsum+=extract);
        }
        System.out.println(evensum+"\t"+oddsum);

    }
}
