public class ParenBitDemo {
    // Class that contains the recursive parenBit method
    class ParenBit {

        // Method to extract substring inside parentheses (including them)
        String parenBit(String str) {

            // Base case: if string starts with '(' and ends with ')'
            if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
                return str;
            }

            // If first character is not '(' remove it

    // Demo class with the main method
    public class ParenBitDemo {

        public static void main(String[] args) {

            // Create object of ParenBit class
            ParenBit extractor = new ParenBit();

            // Test the parenBit method with different strings
            System.out.println("parenBit(\"xyz(abc)123\") → \""
                    + extractor.parenBit("xyz(abc)123") + "\"");

            System.out.println("parenBit(\"x(hello)\") → \""
                    + extractor.parenBit("x(hello)") + "\"");

            System.out.println("parenBit(\"(xy)1\") → \""
                    + extractor.parenBit("(xy)1") + "\"");
        }
    }
}
