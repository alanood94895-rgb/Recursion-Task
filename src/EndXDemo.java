public class EndXDemo {
    // Class that contains the recursive endX method
    class EndX {

        // Method to move all 'x' characters to the end of the string
        String endX(String str) {

            // Base case: if string is empty
            if (str.length() == 0) {
                return "";
            }

    public class EndXDemo {

        public static void main(String[] args) {

            // Create an object of EndX class
            EndX mover = new EndX();

            // Test the endX method with different strings
            System.out.println("endX(\"xxre\") → \"" + mover.endX("xxre") + "\"");

            System.out.println("endX(\"xxhixx\") → \"" + mover.endX("xxhixx") + "\"");

            System.out.println("endX(\"xhixhix\") → \"" + mover.endX("xhixhix") + "\"");
        }
    }
}
