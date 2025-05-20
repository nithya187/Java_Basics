// 🔷 Task 3: Handle Multiple Exceptions
// Description:

// Write a program that might throw both ArithmeticException and ArrayIndexOutOfBoundsException.
// Use multiple catch blocks to handle them.
// Expected Behavior:

// Handle each exception separately and print appropriate messages.
// int[] arr = {1, 2, 3};
// int result = arr[5] / 0;

public class ArrayError {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}; 

        try {
            int result = numbers[5] / 0; 
            System.out.println("Result: " + result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } 
        
    }
}
