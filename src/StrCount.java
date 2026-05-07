public class StrCount {
    // Class that contains the recursive strCount method
    class StrCount {

        // Method to count non-overlapping occurrences of a substring
        int strCount(String str, String sub) {

            if (str.length() < sub.length()) {
                return 0;
            }

            if (str.substring(0, sub.length()).equals(sub)) {

                return 1 + strCount(str.substring(sub.length()), sub);
            }

            return strCount(str.substring(1), sub);
        }
    }
}






