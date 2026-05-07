public class Count8Demo {

            // Get last digit
            int lastDigit = n % 10;



        public static void main(String[] args) {

            // Create an object of Count8 class
            Count8 counter = new Count8();

            // Test the count8 method with different values
            System.out.println("count8(8) → " + counter.count8(8));

            System.out.println("count8(818) → " + counter.count8(818));

            System.out.println("count8(8818) → " + counter.count8(8818));
        }
    }
}
