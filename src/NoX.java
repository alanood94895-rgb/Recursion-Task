public class NoX {

        String noX(String str) {

            if (str.length() == 0) {
                return "";
            }

            char firstChar = str.charAt(0);

            String remaining = noX(str.substring(1));

            if (firstChar == 'x') {
                return remaining;
            }

            return firstChar + remaining;
        }
    }

