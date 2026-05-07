
public class CountHiDemo {
        public static void main(String[] args) {

            // Create object of CountHi class
            CountHi counter = new CountHi();

            System.out.println("countHi(\"xxhixx\") → " + counter.countHi("xxhixx"));

            System.out.println("countHi(\"xhixhix\") → " + counter.countHi("xhixhix"));

            System.out.println("countHi(\"hi\") → " + counter.countHi("hi"));
        }
    }
}
