package phase1.basics_of_programming.operators;

public class bitwise_operator {
    public static void main(String ags[])
    {
        int a = 10;
        int b = 8;

        // binary rep of 7 is 0111
        // binary rep of 7 is 1000
        // result for bitwise & is 0
        System.out.println("a & b = "+(a&b));
        
        // result for bitwise | is 15
        // if any number is 1 = 1
        System.out.println("a | b = "+(a|b));

        // bitwise NOT operator
        System.out.println(" ~a =" + ~a);

        // bitwise XOR operator
        // if 2 numbers are different return 1
        System.out.println("a^b = "+(a^b));

        // Left shift operator (<<)
        // it shifts digits of a number in binary internaly and gives the binary conversion of that number
        // binary of 7 is 0111
        // after left shift 011100 = 28
        System.out.println("a << 2 = "+ (a<<2));
        
        // right shift (>>)
        // binary of 7 is 0111
        // after right shift 01 = 1
        System.out.println("a >> 2 = "+ (a>>1
        ));

        // unnsigned right shift
        // shifts the digits to right and fill the left with 0's
        System.out.println("a >>> 2 = " +(a >>> 2));

    }
}
class Solution  {
    public static void main(String args[]) {
        int a = 6,b=7;
        System.out.println("a | b = "+(a|b));
        
    }
}


