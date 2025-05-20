// 🔷 Task 2: ArrayIndexOutOfBoundsException
// Description:

// Create an integer array with 3 elements and attempt to access the 5th element. Use try-catch to handle ArrayIndexOutOfBoundsException.

// Expected Behavior:

// Catch the exception and print "Index is out of bounds!".


// int[] numbers = {1, 2, 3};
// System.out.println(numbers[4]);

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}; 

        try {
            int result = numbers[4]; 
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds!");
        } 
    }
}
