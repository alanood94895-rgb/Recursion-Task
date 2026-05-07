public class CountAbc {

        // Method to count occurrences of "abc" and "aba"
        int countAbc(String str) {

            // Base case: if string length is less than 3
            if (str.length() < 3) {
                return 0;
            }

            String firstThree = str.substring(0, 3);

            // Check if the substring is "abc" or "aba"
            if (firstThree.equals("abc") || firstThree.equals("aba")) {

                return 1 + countAbc(str.substring(1));
            }

            return countAbc(str.substring(1));
        }
    }





