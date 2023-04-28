package phase1.basics_of_programming.control_statments;

public class iteration_statments {
    public static void main(String args[]) {
    }
}
class JavaWhileloop {
    public static void main(String args[]) {
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
    }
}

class DoWhileLoop {
    public static void main(String args[]) {
        int i = 2;
        do {
            System.out.println(i + " ");
            i++;
        }
        while(i<=14);
        do {
            System.out.println(i + " ");
            i--;
        }
        while(i>1);
    }
}

class ForLoop {
    public static void main(String args[]) {
        for(int i =1 ; i<=10;i++) {
            System.out.println(i + " ");
        for(int ii =10; ii>1; ii--)
            System.out.println(ii + " ");
        }
    }
}

class EnhancedForLoop {
    public static void main(String args[]) {
        // Striing array
        String array[] = {"java","coding","basics","loops"};
        // Enhanced for loop
        for(String a : array) {
            System.out.println(a);
            
        }

    }
}