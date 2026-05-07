public class StrCopies {
    // Class that contains the recursive strCopies method
    class StrCopies {

        // Method to check if sub appears at least n times (overlapping allowed)
        boolean strCopies(String str, String sub, int n) {

            // Base case: if required count is satisfied
            if (n == 0) {
                return true;
            }

            // Base case: if string is too short to contain sub
            if (str.length() < sub.length()) {
                return false;
            }

            // Check if current substring matches "sub"
            if (str.substring(0, sub.length()).equals(sub)) {

                // Match found: reduce n and continue (allow overlap)
                return strCopies(str.substring(1), sub, n - 1);
            }

            // No match: move forward without reducing n
            return strCopies(str.substring(1), sub, n);
        }
    }

    }
}
