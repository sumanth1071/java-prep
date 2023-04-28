package phase1.basics_of_programming.operators;

// instanceOf operator is used to compare an object of a specified type
public class instance_of {
    public static void main(String args[]) {
        
    parentClass obj1 = new parentClass();
    childClass obj2 = new childClass();
    System.out.println(obj1 instanceof parentClass);
    System.out.println(obj1 instanceof childClass);
    System.out.println(obj1 instanceof myInterface);
    System.out.println(obj2 instanceof myInterface);
    System.out.println(obj2 instanceof childClass);
    System.out.println(obj2 instanceof parentClass);
    }

}

class parentClass {

}
// extends is used to extend the existing class with
// another classes objects 
class childClass extends parentClass implements myInterface {

}

interface myInterface {

}