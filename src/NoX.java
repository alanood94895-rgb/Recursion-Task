public class NoX {

        String noX(String str) {

            if (str.length() == 0) {
                return "";
            }

            char firstChar = str.charAt(0);

            String remaining = noX(str.substring(1));

            // If first character is 'x', skip it
            if (firstChar == 'x') {
                return remaining;
            }

            // Otherwise include the character
            return firstChar + remaining;
        }
    }

