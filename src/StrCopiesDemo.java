public class StrCopiesDemo {

        public static void main(String[] args) {

            StrCopies checker = new StrCopies();

            System.out.println(checker.strCopies("catcowcat", "cat", 2));

            System.out.println( checker.strCopies("catcowcat", "cow", 2));

            System.out.println(checker.strCopies("catcowcat", "cow", 1));
        }
    }

