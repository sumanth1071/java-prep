package phase1.basics_of_programming.methods;

public class method_overloading {
    public static int add(int a,int b) {
        return a+b;
    }
    public static int add(int a,int b,int c) {
        return a+b+c;
    }
    public static double add(double a,double b,double c,double d) {
        return a+b+c+d;
    }
public static void main(String args[]) {
    int sumof2 = method_overloading.add(10, 20);
    int sumof3 = method_overloading.add(10, 20, 30);
    double sumof4 = method_overloading.add(83.3, 72.9, 82.1, 23);
    System.out.println(sumof2);
    System.out.println(sumof3);
    System.out.println(sumof4);
}
}


