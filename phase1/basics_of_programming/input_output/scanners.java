package phase1.basics_of_programming.input_output;

import java.util.Scanner;
class TakingInputFromUserUsingScanners
{
    public static void main(String args[])
    {
        // To declare Scanner Class object
        // We use new keyword 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        
        float b = sc.nextFloat();
        System.out.println(b);
        
        double d = sc.nextDouble();
        System.out.println(d);
        
        short s = sc.nextShort();
        System.out.println(s);
        
        byte m = sc.nextByte();
        System.out.println(m);
        
        boolean n = sc.nextBoolean();
        System.out.println(n);
        
        String l = sc.nextLine();
        System.out.println(l);
        // char r = sc.next();
    }
}