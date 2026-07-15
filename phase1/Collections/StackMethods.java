import java.util.Stack;
public class StackMethods {
/**
 * Main method to demonstrate Stack operations
 * @param args command line arguments
 */
public static void main(String args[]) {
    // Create a stack to store fruits
    Stack<String> fruits = new Stack<>();

    // Push fruits onto the stack
    fruits.push("Apple");
    fruits.push("Orange");
    fruits.push("Banana");

    // Display the stack
    System.out.println(fruits);

    // Remove the top element from the stack
    fruits.pop();
    System.out.println(fruits);

    // Peek at the top element of the stack
    fruits.peek();
    System.out.println(fruits);

    // Search for an element in the stack
    fruits.search("Apple");
    System.out.println(fruits);

    // Check if the stack is empty
    System.out.println(fruits.isEmpty());

    // Print the size of the stack
    System.out.println(fruits.size());
    }
}
    

