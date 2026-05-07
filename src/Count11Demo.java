public class Count11Demo {


    public class Count11Demo {

        public static void main(String[] args) {

            // Create an object of Count11 class
            Count11 counter = new Count11();

            // Test the count11 method with different strings
            System.out.println("count11(\"11abc11\") → " + counter.count11("11abc11"));

            System.out.println("count11(\"abc11x11x11\") → " + counter.count11("abc11x11x11"));

            System.out.println("count11(\"111\") → " + counter.count11("111"));
        }
    }
}
