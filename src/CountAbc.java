public class CountAbc {

        // Method to count occurrences of "abc" and "aba"
        int countAbc(String str) {

            // Base case: if string length is less than 3
            if (str.length() < 3) {
                return 0;
            }

            // Get the first 3 characters
            String firstThree = str.substring(0, 3);

            // Check if the substring is "abc" or "aba"
            if (firstThree.equals("abc") || firstThree.equals("aba")) {

                // Count the match and continue recursion
                return 1 + countAbc(str.substring(1));
            }

            // Continue recursion without counting
            return countAbc(str.substring(1));
        }
    }

    // Demo class with the main method
    public class CountAbcDemo {

        public static void main(String[] args) {

            // Create an object of the CountAbc class
            CountAbc counter = new CountAbc();

            // Test the countAbc method with different strings

