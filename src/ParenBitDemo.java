public class ParenBitDemo {

        public static void main(String[] args) {

            ParenBit extractor = new ParenBit();

            System.out.println(extractor.parenBit("xyz(abc)123"));

            System.out.println("parenBit(\"x(hello)\") → \""
                    + extractor.parenBit("x(hello)") + "\"");

            System.out.println("parenBit(\"(xy)1\") → \""
                    + extractor.parenBit("(xy)1") + "\"");
        }
    }

