public class StrCountDemo {






    // Demo class with the main method
    public class StrCountDemo {

        public static void main(String[] args) {

            // Create an object of the StrCount class
            StrCount counter = new StrCount();

            // Test the strCount method with different substrings
            System.out.println("strCount(\"catcowcat\", \"cat\") → "
                    + counter.strCount("catcowcat", "cat"));

            System.out.println("strCount(\"catcowcat\", \"cow\") → "
                    + counter.strCount("catcowcat", "cow"));

            System.out.println("strCount(\"catcowcat\", \"dog\") → "
                    + counter.strCount("catcowcat", "dog"));
        }
    }
}
