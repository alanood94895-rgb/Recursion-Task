
public class CountHiDemo {
        public static void main(String[] args) {

            CountHi counter = new CountHi();

            System.out.println( counter.countHi("xxhixx"));

            System.out.println("countHi(\"xhixhix\") → " + counter.countHi("xhixhix"));

            System.out.println("countHi(\"hi\") → " + counter.countHi("hi"));
        }
    }
}
