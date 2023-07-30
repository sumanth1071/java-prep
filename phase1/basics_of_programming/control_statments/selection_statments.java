package phase1.basics_of_programming.control_statments;

public class selection_statments {
    public static void main(String args[]) {
        int a = 10;
        if (a == 10)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");

        }
    }
}

class if_else_if {
    public static void main(String args[]) {
        int a = 100;
        if(a == 30)
            System.out.println("a is 30");
        else if(a == 40)
            System.out.println("a is 30");
        else if(a == 50)
            System.out.println("a is 30");
        else
            System.out.println("a is not present");
    }
}

class jump_statments {
    public static void main(String args[]) {
        int n = 5;
        switch(n) {
            case 5:
                System.out.println("n value is 0");
            
            case 1:
                System.out.println("n value is 1");
                break;
            case 2:
                System.out.println("n value is 2");
                break;
            default:
                System.out.println("n value is greater than 2");
        }
    }
}