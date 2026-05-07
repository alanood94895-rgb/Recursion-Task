public class Count7 {
    int count7(int n) {

        if (n == 0) {
            return 0;

        }

        int lastDigit = n % 10;

        if (lastDigit == 7) {

            return 1 + count7(n / 10);

        } else {

        }
        return lastDigit;
    }

}
