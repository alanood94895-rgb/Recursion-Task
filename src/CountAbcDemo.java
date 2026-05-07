public class CountAbcDemo {

        public static void main(String[] args) {

            CountAbc counter = new CountAbc();

            System.out.println(counter.countAbc("abc"));

            System.out.println(counter.countAbc("abcxxabc"));

            System.out.println( counter.countAbc("abaxxaba"));
        }
    }


