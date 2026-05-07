public class Fibonacci {
    // Class that contains the recursive fibonacci method
    class Fibonacci {

        // Method to calculate Fibonacci numbers using recursion
        int fibonacci(int n) {

            // Base case: fibonacci(0) = 0
            if (n == 0) {
                return 0;
            }

            // Base case: fibonacci(1) = 1
            if (n == 1) {
                return 1;
            }

            // Recursive case
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }



}
