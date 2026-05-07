public class NoX {

        String noX(String str) {

            // Base case: if string is empty
            if (str.length() == 0) {
                return "";
            }

            // Get the first character
            char firstChar = str.charAt(0);

            // Process the remaining string
            String remaining = noX(str.substring(1));

            // If first character is 'x', skip it
            if (firstChar == 'x') {
                return remaining;
            }

            // Otherwise include the character
            return firstChar + remaining;
        }
    }

