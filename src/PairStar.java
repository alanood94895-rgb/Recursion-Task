public class PairStar {
    // Method to insert "*" between identical adjacent characters
    String pairStar(String str) {

        // Base case: if string length is 0 or 1
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        // Get the first and second characters
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        // Check if both characters are the same
        if (firstChar == secondChar) {

            // Insert "*" between identical characters
            return firstChar + "*" + pairStar(str.substring(1));
        }

        // Otherwise, continue recursion normally
        return firstChar + pairStar(str.substring(1));
    }
}

// Demo class with the main method





    }
}

