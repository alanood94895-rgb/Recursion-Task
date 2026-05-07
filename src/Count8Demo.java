public class Count8Demo {

            // Get last digit
            int lastDigit = n % 10;

            // Get previous digit
            int prevDigit = (n / 10) % 10;

            // Remove last digit for recursion
            int remaining = n / 10;

            // If last digit is 8 and previous is also 8 → count double
            if (lastDigit == 8 && prevDigit == 8) {
                return 2 + count8(remaining);
            }

            // If last digit is 8 → count 1
            if (lastDigit == 8) {


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
