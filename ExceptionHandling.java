// 🔷 Task 1: Handle ArithmeticException
// Description:

// Write a program that performs division of two integers. Handle the case where the denominator is zero using try-catch.

// Expected Behavior:

// If the user tries to divide by zero, catch the ArithmeticException and display "Cannot divide by zero!".



// int a = 10;
// int b = 0; // try changing to 2
// int result = a / b;
public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //int b = 2;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } 
        finally {
            System.out.println("Finally block executed");
        }
    }
}
