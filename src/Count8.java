public class Count8 {
    // Class that contains the recursive count8 method

        // Method to count 8s with special rule for consecutive 8s
        int count8(int n) {

            // Base case: if number becomes 0
            if (n == 0) {
                return 0;
            }

            // Get last digit
            int lastDigit = n % 10;

            // Get previous digit
            int prevDigit = (n / 10) % 10;

            // Remove last digit for recursion
            int remaining = n / 10;

            // If last digit is 8 and previous is also 8 → count double
            if (lastDigit == 8 && prevDigit == 8) {
                return 2 + count8(remaining);
            }

            // If last digit is 8 → count 1
            if (lastDigit == 8) {
                return 1 + count8(remaining);
            }

            // Otherwise count 0
            return count8(remaining);
        }
    }


