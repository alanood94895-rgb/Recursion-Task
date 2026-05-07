public class StrCount {
    // Class that contains the recursive strCount method
    class StrCount {

        // Method to count non-overlapping occurrences of a substring
        int strCount(String str, String sub) {

            // Base case: if str is shorter than sub
            if (str.length() < sub.length()) {
                return 0;
            }

            // Check if the beginning of str matches sub
            if (str.substring(0, sub.length()).equals(sub)) {

                // Count the match and move forward by sub.length()
                return 1 + strCount(str.substring(sub.length()), sub);
            }

            // Move forward by one character and continue recursion
            return strCount(str.substring(1), sub);
        }
    }

    // Demo class with the main method
    public class StrCountDemo {

        public static void main(String[] args) {

            // Create an object of the StrCount class
            StrCount counter = new StrCount();



