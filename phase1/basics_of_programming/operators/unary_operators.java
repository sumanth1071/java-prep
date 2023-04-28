package phase1.basics_of_programming.operators;

public class unary_operators {
    public class Unaryminusoperator {
        public static void main(String args[]) {
        // convert positive value to negative value 
        int num1 = 10;
        num1 = -num1;
        System.out.println(num1);
        
        // convert negative value 
        // into positive value
        int num2 = -20;
        num2 = -num2;
        System.out.println(num2);
        
        }

    }
    public class UnaryNotOperator {
        public static void main(String args[]) {
            int a = 10, b= 20;
            System.out.println("(a<b) = " + (a<b));
            System.out.println("(a<b) = " + !(a<b));
    
            
        }
    }
    class UnaryIncrementDecrementOperator {
        public static void main(String args[]) {
            int a = 10;
            // post increment
            System.out.println(a++);
            // pre inccrement
            System.out.println(++a);
            // post decrement
            System.out.println(a--);
            // pre decrement
            System.out.println(--a);
        }
    }
    class UnaryBitwiseOpeartor {
        public static void main(String args[]) {
            int a = 10 , b = -20;
            // ~ works on ~N = -(N+1)
            System.out.println(~a);
            System.out.println(~b);
            
        }
    }
}
