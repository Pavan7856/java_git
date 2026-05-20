public class Try_catch_finallyblock {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int data = 10 / 2; // no exception
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Rest of the code...");
    }
}