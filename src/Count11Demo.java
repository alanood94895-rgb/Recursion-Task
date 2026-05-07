public class Count11Demo {

    // Class that contains the recursive count11 method
    class Count11 {

        // Method to count non-overlapping occurrences of "11"
        int count11(String str) {

            // Base case: if string is shorter than 2 characters
            if (str.length() < 2) {
                return 0;
            }

            // Check if the first two characters are "11"
            if (str.substring(0, 2).equals("11")) {

                // Count this occurrence and skip 2 characters (no overlap)
                return 1 + count11(str.substring(2));
            }

            // Otherwise move forward by 1 character
            return count11(str.substring(1));
        }
    }

    // Demo class with the main method
    public class Count11Demo {

        public static void main(String[] args) {

            // Create an object of Count11 class
            Count11 counter = new Count11();

            // Test the count11 method with different strings
            System.out.println("count11(\"11abc11\") → " + counter.count11("11abc11"));

            System.out.println("count11(\"abc11x11x11\") → " + counter.count11("abc11x11x11"));

            System.out.println("count11(\"111\") → " + counter.count11("111"));
        }
    }
}
