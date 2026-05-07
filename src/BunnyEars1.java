public class BunnyEars1 {
    // Class that contains the recursive bunnyEars method

        // Method to calculate total bunny ears
        int bunnyEars(int n) {

            if (n == 0) {
                return 0;
            }
            return 2 + bunnyEars(n - 1);
        }
    }


