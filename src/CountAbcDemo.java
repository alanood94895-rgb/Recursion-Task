public class CountAbcDemo {
    // Class that contains the recursive countAbc method
    class CountAbc {

        // Method to count occurrences of "abc" and "aba"
        int countAbc(String str) {






    // Demo class with the main method
    public class CountAbcDemo {

        public static void main(String[] args) {

            // Create an object of the CountAbc class
            CountAbc counter = new CountAbc();

            // Test the countAbc method with different strings
            System.out.println("countAbc(\"abc\") → " + counter.countAbc("abc"));

            System.out.println("countAbc(\"abcxxabc\") → " + counter.countAbc("abcxxabc"));

            System.out.println("countAbc(\"abaxxaba\") → " + counter.countAbc("abaxxaba"));
        }
    }

}
