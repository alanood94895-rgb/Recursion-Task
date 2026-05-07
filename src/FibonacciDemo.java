public class FibonacciDemo {


        public static void main(String[] args) {

            // Create an object of Fibonacci class
            Fibonacci fib = new Fibonacci();

            // Test the fibonacci method with different values
            System.out.println("fibonacci(0) → " + fib.fibonacci(0));

            System.out.println("fibonacci(1) → " + fib.fibonacci(1));

            System.out.println("fibonacci(2) → " + fib.fibonacci(2));

            System.out.println("fibonacci(5) → " + fib.fibonacci(5));

            System.out.println("fibonacci(10) → " + fib.fibonacci(10));
        }
    }
}
