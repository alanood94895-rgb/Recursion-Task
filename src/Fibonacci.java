public class Fibonacci {

        int fibonacci(int n) {

            // Base case: fibonacci(0) = 0
            if (n == 0) {
                return 0;
            }

            if (n == 1) {
                return 1;
            }

            // Recursive case
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }



}
