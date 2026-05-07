public class Count11 {

        int count11(String str) {

            if (str.length() < 2) {
                return 0;
            }

            if (str.substring(0, 2).equals("11")) {

                return 1 + count11(str.substring(2));
            }

            // Otherwise move forward by 1 character
            return count11(str.substring(1));
        }
    }

    // Demo class with the main method
    public class Count11Demo {

        public static void main(String[] args) {

            // Create an object of Count11 class
            Count11 counter = new Count11();

            // Test the count11 method with different strings
            System.out.println("count11(\"11abc11\") → " + counter.count11("11abc11"));

            System.out.println("count11(\"abc11x11x11\") → " + counter.count11("abc11x11x11"));

            System.out.println("count11(\"111\") → " + counter.count11("111"));
        }
    }
}
