package phase1.basics_of_programming.control_statments;

public class jump_statments {
    public void main(String args[]) {
        
    }
}

class break_statemnets {
    public static void main(String args[]) {
        for(int i = 1;i <= 5;i++) {
            if(i == 5)
            break;
            System.out.println(i + " ");
        }
        
    }
}

class Labeled_break_statemnets {
    public static void main(String args[]) {
        boolean b = true;
        first: {
            second: {
                third: {
                    System.out.println("This is before break statment");
                    
                    if(b)
                    break second; 
                    
                    System.out.println("This is not printed");
                }
                
                System.out.println("This is not printed");
            }
            System.out.println("This is printed because it is after the second label");
        }
    }
}

class continue_statemnets {
    public static void main(String args[]) {
        for(int i = 1;i <= 5;i ++) {
            if (i==3)
            continue;
            System.out.println(i);
        }
    }

}

class continue_statements_nested {
    public static void main(String args[]) {
        for(int i = 1;i<=5;i++) {
            
            for(int j = 1;j<=5;j++) {

                if(i==2 && j==2) {
                    continue;
                }
                System.out.println(i+ " "+j);
        }
    }
}
}

class continue_labelled_statments {
    public static void main(String args[]) {
        aa:
        for(int i = 1; i<=3; i++) {
            bb:
            for(int j = 1; j<=3; j++) {
                if(i==2 && j==2) {
                    continue aa;
                }
                System.out.println(i + " " + j);
        }
    }
}
}

class Return_statments {
    public static float findsum(int num1,int num2) {
        int sum = num1 + num2;

        return sum;
    }
    public static void main(String args[]) {
        Return_statments obj = new Return_statments();
        System.out.println(obj.findsum(10, 20));
        
    }
}