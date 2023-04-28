package phase1.basics_of_programming.operators;

public class Assignment_operators {
    public static void main(String args[]) {
        int a = 10;
        a += 10;
        System.out.println(a);   
        
        a -= 5;
        System.out.println(a);   

        a *= 10;
        System.out.println(a);   

        a /= 2;
        System.out.println(a);   

        a %= 2;
        System.out.println(a);  
        
        int a1 = 7 , b = 18 , c = 45;
        a1 -= 4;
        b *= 2 ; c /= 9;
        System.out.println(a1+" "+b+" "+c);
        
        int numa = 20;
        numa %= 3;
        System.out.println(numa);   


    }
}
