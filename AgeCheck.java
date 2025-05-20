// 🔷 Task 5: Custom Exception
// Description:

// Create a custom exception class InvalidAgeException that is thrown when the age is less than 18.  
// note:- try to implememt logic of inheritance(Exception given by java will be parent class the create your custom class) with custom method for this logic

// Expected Behavior:
// Throw the exception if age is below 18 and catch it to print "Age must be 18 or older."
// Step 1: Create a custom exception class

class InvalidAgeException extends Exception {
    
    public InvalidAgeException(String message) {
        super(message);  
    }
}
public class AgeCheck {
    public static void main(String[] args) {
        int age = 17;  

        try {
           
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            } else {
                System.out.println("Access granted.");
            }
        } catch (InvalidAgeException e) {
           
            System.out.println(e.getMessage());
        }
    }
}
