// 🔷 Task 4: Finally Block Execution
// Description:

// Demonstrate the use of finally block. Even if an exception occurs,
// the finally block should print "Cleanup done."
// Expected Behavior:
// The finally block always executes, regardless of exception handling.


// try {
//     int x = 10 / 0;
// } catch (Exception e) {
//     System.out.println("Exception occurred");
// } finally {
//     System.out.println("Cleanup done");
// }
public class Block {
    public static void main(String[] args) {
        int[] x = {1, 2, 3}; 

        try {
            int y = 10 / 0; 
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Cleanup done");
        }
    }
}
