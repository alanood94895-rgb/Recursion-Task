public class StrCountDemo {

        public static void main(String[] args) {
            StrCount counter = new StrCount();

            System.out.println("strCount(\"catcowcat\", \"cat\") → "
                    + counter.strCount("catcowcat", "cat"));

            System.out.println(counter.strCount("catcowcat", "cow"));

            System.out.println(counter.strCount("catcowcat", "dog"));
        }
    }
}
