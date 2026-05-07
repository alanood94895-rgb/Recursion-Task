public class BunnyEars1 {
    // Class that contains the recursive bunnyEars method

        // Method to calculate total bunny ears
        int bunnyEars(int n) {

            // Base case: no bunnies means 0 ears
            if (n == 0) {
                return 0;
            }

            // Each bunny has 2 ears
            return 2 + bunnyEars(n - 1);
        }
    }


