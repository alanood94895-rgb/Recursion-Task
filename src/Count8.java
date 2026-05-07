public class Count8 {

        int count8(int n) {

            if (n == 0) {
                return 0;
            }

            int lastDigit = n % 10;

            int prevDigit = (n / 10) % 10;

            int remaining = n / 10;

            if (lastDigit == 8 && prevDigit == 8) {
                return 2 + count8(remaining);
            }

            if (lastDigit == 8) {
                return 1 + count8(remaining);
            }

            return count8(remaining);
        }
    }


