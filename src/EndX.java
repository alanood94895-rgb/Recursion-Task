public class EndX {
    // Class that contains the recursive endX method
    class EndX {

        // Method to move all 'x' characters to the end of the string
        String endX(String str) {

            // Base case: if string is empty
            if (str.length() == 0) {
                return "";
            }

            // Get the first character
            char firstChar = str.charAt(0);

            // Process the remaining string recursively
            String resultFromRest = endX(str.substring(1));

            // If the character is 'x', move it to the end
            if (firstChar == 'x') {
                return resultFromRest + "x";
            }

            // Otherwise keep it in its original order
            return firstChar + resultFromRest;
        }
    }


}
