package phase1.problems;

public class Sum_of_even_till_N {
    public static long evenSum(int n) {
        long sum = 0;
        long i = 0;
        for(;i<=n;i=i+2) {
            sum += i;
        }
        return i;
    }

    public static void main(String args[]) {
        Sum_of_even_till_N obj = new Sum_of_even_till_N();
        System.out.println(obj.evenSum(4));     
    }
}

