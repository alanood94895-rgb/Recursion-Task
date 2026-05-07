public class CountHi {
}
// Class that contains the recursive countHi method
class CountHi {

    // Method to count occurrences of "hi" using recursion
    int countHi(String str) {

        // Base case: if string has less than 2 characters
        if (str.length() < 2) {
            return 0;
        }

        // Check if the first two characters are "hi"
        if (str.substring(0, 2).equals("hi")) {

            return 1 + countHi(str.substring(2));
        }

        return countHi(str.substring(1));
    }
}

