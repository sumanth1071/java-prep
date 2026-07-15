import java.util.List;
import java.util.ArrayList;

public class CollectionMethods{
    public static void main(String args[]) {

        // Create list
        // Syntax: List<DataType> ListName = new ArrayList<DataType>();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(1);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Print the list
        System.out.println(list);
        // Print size of the list
        System.out.println(list.size());
        // check if an object contains in the list 
        System.out.println(list.contains(200));
        //check if the list is empty
        System.out.println(list.isEmpty());

        //containsAll returns true if the list contains all objects in the list2
        System.out.println(list.containsAll(list2));

        // To remove an object
        // using index
        list.remove(1);
        // using value or object
        list.remove(Integer.valueOf(20));
        System.out.println(list);


        // to addAll objects from a collection to other collection.
        System.out.println(list.addAll(list2));
        System.out.println(list);

        // to removeAll objects from a collection
        System.out.println(list.removeAll(list2));
        System.out.println(list);

        // to clear all objects from the list
        list.clear();
        System.out.println(list);
        
        // to retain all objects from a collection
        list.add(1);
        list.add(10);
        list.addAll(list2);
        System.out.println(list.retainAll(list2));
        System.out.println(list);

        // toArray() used to convert the list into an array                
        Object a[] = list.toArray();

        for(Object o : a) {
            Integer temp = (Integer) o;
            System.out.print(o+" ");
        }
    }
    
}