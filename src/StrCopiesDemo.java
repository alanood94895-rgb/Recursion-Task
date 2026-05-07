public class StrCopiesDemo {

        public static void main(String[] args) {

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
