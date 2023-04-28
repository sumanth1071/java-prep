package phase1.basics_of_programming.operators;


// ternary operator = conditional operator
// only operator in java that takes 3 operands
public class ternary_operator {
    public static void main(String args[])
    {
        // variable = expression1 ? expression2 : expression3
        // if Expression1 is true then expression2 evaluated
        // else expression3 will be evaluated
        int a = 10;
        int b = 100;
        int minimum = (a < b) ? a : b;
        System.out.println(minimum);
        String min = (a > b) ? "correct" : "wrong" ;
        System.out.println(min);
    }
}
