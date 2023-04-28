package phase1.basics_of_programming.operators;

public class Logical_operators {
    public static void main(String args[]) {
        int a = 10 , v = 27 , m = 23;
        System.out.println((a < m) && (v > m));
        System.out.println((a > m) && (v > m));
        System.out.println((a > m) || (v > m));
        System.out.println((a > m) || (v < m));
        System.out.println( a != v);
        System.out.println( a == v);
    }
}
           

