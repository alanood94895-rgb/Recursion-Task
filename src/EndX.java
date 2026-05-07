public class EndX {

        String endX(String str) {

            if (str.length() == 0) {
                return "";
            }

            char firstChar = str.charAt(0);

            String resultFromRest = endX(str.substring(1));

            if (firstChar == 'x') {
                return resultFromRest + "x";
            }

            return firstChar + resultFromRest;
        }
    }



