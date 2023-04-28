package phase1.basics_of_programming.methods;

public class hello_world {
    public static String print() {
        String str = "hello World";
        return str;
    }

    public static void main(String args[]) {
        hello_world obj = new hello_world();
        System.out.println(obj.print());
    }
}

