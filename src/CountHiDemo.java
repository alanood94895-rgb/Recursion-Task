public class CountHiDemo {
    // Class that contains the recursive countHi method
    class CountHi {

        // Method to count occurrences of "hi" using recursion
        int countHi(String str) {

            // Base case: if string has less than 2 characters
            if (str.length() < 2) {
                return 0;
            }

            // Check if the first two characters are "hi"
            if (str.substring(0, 2).equals("hi")) {

                // Count this occurrence and skip 2 characters
                return 1 + countHi(str.substring(2));
            }

            // Otherwise move forward by 1 character
            return countHi(str.substring(1));
        }
    }

    // Demo class with the main method
    public class CountHiDemo {

        public static void main(String[] args) {

            // Create object of CountHi class
            CountHi counter = new CountHi();

            // Test the countHi method with different strings
            System.out.println("countHi(\"xxhixx\") → " + counter.countHi("xxhixx"));

            System.out.println("countHi(\"xhixhix\") → " + counter.countHi("xhixhix"));

            System.out.println("countHi(\"hi\") → " + counter.countHi("hi"));
        }
    }
}
