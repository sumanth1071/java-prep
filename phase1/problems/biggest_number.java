package phase1.problems;
import java.util.Scanner;
public class biggest_number {
    public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a>b && a>c) {
			System.out.println(a);
		}
		else if (b>a && b>c) {

			System.out.println(b);
		}
		else {
			System.out.println(c);
			
		}
	}
}

