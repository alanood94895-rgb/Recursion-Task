public class FibonacciDemo {

        public static void main(String[] args) {

            Fibonacci fib = new Fibonacci();

            System.out.println( fib.fibonacci(0));

            System.out.println(fib.fibonacci(1));

            System.out.println("fibonacci(2) → " + fib.fibonacci(2));

            System.out.println("fibonacci(5) → " + fib.fibonacci(5));

            System.out.println("fibonacci(10) → " + fib.fibonacci(10));
        }
    }

