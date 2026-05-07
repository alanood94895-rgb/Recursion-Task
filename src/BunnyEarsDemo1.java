public class BunnyEarsDemo1 {

        int bunnyEars(int n) {

            if (n == 0) {
                return 0;
            }

            return 2 + bunnyEars(n - 1);
        }
    }

    // Demo class with the main method
    public class BunnyEarsDemo {

        public static void main(String[] args) {

            // Create an object of the BunnyEars class
            BunnyEars bunny = new BunnyEars();

            // Test the bunnyEars method with different values
            System.out.println("bunnyEars(0) → " + bunny.bunnyEars(0));

            System.out.println("bunnyEars(1) → " + bunny.bunnyEars(1));

            System.out.println("bunnyEars(2) → " + bunny.bunnyEars(2));
        }
    }
}
