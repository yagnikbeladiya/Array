
public class CatchExercise {

    public static void main(String[] args) {
        try {
            // Declare and initialize an array
            int[] a = new int[5];
            // Assign a value to the array
            a[5] = 30 / 5;  // This line will throw ArrayIndexOutOfBoundsException
            
            // This line is to potentially cause ArithmeticException (uncomment to test)
            // int result = 30 / 0;

            System.out.println("This line will not be executed if an exception occurs above.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch blocks.");
    }
}
