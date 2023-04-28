package phase1.problems;

import java.util.Scanner ;
// import java.io.*; 
import java.lang.Math;
class total_salary {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();
		char grade = sc.next().charAt(0);
		double hra = 0.2 * salary;
		double da = 0.5 * salary;
		double pf = 0.11 * salary;
		int allow;
		if (grade == 'A')
		{
			allow = 1700;
		}
		else if (grade == 'B')
		{
			allow = 1500;
		}
		else
		{
			allow = 1300;
		}
		
		
		double total_salary = salary+hra+da+allow-pf;
		System.out.println(Math.round(total_salary));
	}
}