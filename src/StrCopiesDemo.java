public class StrCopiesDemo {

            // No match: move forward without reducing n
            return strCopies(str.substring(1), sub, n);
        }
    }

    // Demo class with the main method
    public class StrCopiesDemo {

        public static void main(String[] args) {

            // Create object of StrCopies class
            StrCopies checker = new StrCopies();

            // Test the strCopies method with different inputs
            System.out.println("strCopies(\"catcowcat\", \"cat\", 2) → "
                    + checker.strCopies("catcowcat", "cat", 2));

            System.out.println("strCopies(\"catcowcat\", \"cow\", 2) → "
                    + checker.strCopies("catcowcat", "cow", 2));

            System.out.println("strCopies(\"catcowcat\", \"cow\", 1) → "
                    + checker.strCopies("catcowcat", "cow", 1));
        }
    }
}
