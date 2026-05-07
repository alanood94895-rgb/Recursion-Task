public class ParenBit {

        // Method to extract substring inside parentheses (including them)
        String parenBit(String str) {

            // Base case: if string starts with '(' and ends with ')'
            if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
                return str;
            }

            if (str.charAt(0) != '(') {
                return parenBit(str.substring(1));
            }

            if (str.charAt(str.length() - 1) != ')') {
                return parenBit(str.substring(0, str.length() - 1));
            }

            return str;
        }
    }

}
