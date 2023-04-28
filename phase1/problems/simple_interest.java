package phase1.problems;
import java.util.* ;
import java.io.*; 
class simple_interest {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		int t = sc.nextInt();
		int an = (int)(a*b*t)/100;
		System.out.println(an);

		
	}
}
class conversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float m = sc.nextFloat();
        int n =  sc.nextInt();
        float s = (float)(m*n);
        System.out.println(s);
    }
}