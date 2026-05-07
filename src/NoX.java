public class NoX {
    // Class that contains the recursive noX method
    class NoX {

        // Method to remove all 'x' characters from a string
        String noX(String str) {

            // Base case: if string is empty
            if (str.length() == 0) {
                return "";
            }

            // Get the first character
            char firstChar = str.charAt(0);

            // Process the remaining string
            String remaining = noX(str.substring(1));

            // If first character is 'x', skip it
            if (firstChar == 'x') {
                return remaining;
            }

            // Otherwise include the character
            return firstChar + remaining;
        }
    }

    // Demo class with the main method
    public class NoXDemo {

        public static void main(String[] args) {

            // Create object of NoX class
            NoX remover = new NoX();

            // Test the noX method with different strings
            System.out.println("noX(\"xaxb\") → \"" + remover.noX("xaxb") + "\"");

            System.out.println("noX(\"abc\") → \"" + remover.noX("abc") + "\"");

            System.out.println("noX(\"xx\") → \"" + remover.noX("xx") + "\"");
        }
    }
}
