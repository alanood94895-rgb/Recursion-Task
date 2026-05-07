public class EndXDemo {
    // Class that contains the recursive endX method
    class EndX {

        // Method to move all 'x' characters to the end of the string
        String endX(String str) {

            // Base case: if string is empty
            if (str.length() == 0) {
                return "";
            }

