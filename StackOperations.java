// Stack operations in Java
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        // Declare a stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println("Initial Stack: " + stack);

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            if (!stack.isEmpty()) {
                int removed = stack.pop();
                System.out.println("Removed element: " + removed);
            } else {
                System.out.println("Stack is empty. Cannot remove more elements.");
            }
        }

        // Display the final stack
        System.out.println("Final Stack after removing 4 elements: " + stack);
    }
}
