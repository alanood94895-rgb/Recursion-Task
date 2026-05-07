public class ParenBitDemo {
    // Class that contains the recursive parenBit method
    class ParenBit {


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
