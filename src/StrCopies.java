public class StrCopies {
    // Class that contains the recursive strCopies method
    class StrCopies {

        // Method to check if sub appears at least n times (overlapping allowed)
        boolean strCopies(String str, String sub, int n) {

            // Base case: if required count is satisfied
            if (n == 0) {
                return true;
            }

            if (str.length() < sub.length()) {
                return false;
            }

            if (str.substring(0, sub.length()).equals(sub)) {

                return strCopies(str.substring(1), sub, n - 1);
            }

            return strCopies(str.substring(1), sub, n);
        }
    }

