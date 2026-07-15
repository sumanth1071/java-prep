// The Java List interface extends the Collection interface and 
// adds methods specific to lists, 
// which are ordered collections that allow duplicates.

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListMethods {
    /**
     * Main method to demonstrate the usage of List methods
     * @param args command line arguments
     */
    public static void main(String args[]) {
        
        // Create a List to store integers
        List<Integer> list = new ArrayList<Integer>();
        
        // Add elements to the list
        list.add(1);   // Add element 1
        list.add(2);   // Add element 2
        list.add(3);   // Add element 3

        // Retrieve the element at the specified index
        System.out.println("Element at index 1: " + list.get(1));  // Get element at index 1

        // Replace the element at a specified index with the given element
        list.set(1, 4);    // Replace element at index 1 with 4
        System.out.println("Updated List: " + list);  // Print updated list

        // Add an element to the list at a specified index
        list.add(1, 5);   // Add element 5 at index 1
        System.out.println("Updated List after adding element at index 1: " + list);  // Print updated list

        // Remove an element from the list
        list.remove(1);   // Remove element at index 1
        System.out.println("Updated List after removing element at index 1: " + list);  // Print updated list

        // Get the index of an element
        System.out.println("Index of element 1: " + list.indexOf(1));  // Get index of element 1

        // Get the last index of an element
        System.out.println("Last index of element 1: " + list.lastIndexOf(1));  // Get last index of element 1

        // Get the size of the list
        System.out.println("Size of the list: " + list.size());  // Get size of the list

        // Check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());  // Check if the list is empty

        // Create a List to store strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");   // Add element "Apple"
        fruits.add("Orange");  // Add element "Orange"
        fruits.add("Banana");  // Add element "Banana"
        fruits.add("Grape");   // Add element "Grape"
        System.out.println("Fruits List: " + fruits);  // Print the fruits list

        // Iterate over the list using index
        for(int i = 0; i<fruits.size(); i++) {
            System.out.println("Fruit at index " + i + ": " + fruits.get(i));  // Get fruit at index i
        }

        // Iterate over the list using enhanced for loop
        for(String f : fruits) {
            System.out.println("Fruit: " + f);  // Print fruit
        }

        // Iterate over the list using Collection Iterator
        Iterator<String> fe = fruits.iterator();

        while(fe.hasNext()) {
            System.out.println("Fruit: " + fe.next());  // Print fruit
        } 
        
        // Iterate over the list using ListIterator
        ListIterator<String> li = fruits.listIterator();

        while(li.hasNext()) {
            System.out.println("Fruit: " + li.next());  // Print fruit
        }

        // subList method
        List<String> subList = fruits.subList(1, 3);  // Get sublist from index 1 to index 2
        System.out.println("Sub List: " + subList);  // Print sublist

    }
}