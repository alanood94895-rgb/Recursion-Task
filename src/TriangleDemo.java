public class TriangleDemo {

    // Class that contains the recursive triangle method
    class Triangle {

        // Method to calculate total blocks in a triangle
        int triangle(int n) {

            // Base case: no rows means 0 blocks
            if (n == 0) {
                return 0;
            }

            // Add the current row number and continue recursion
            return n + triangle(n - 1);
        }
    }

    // Demo class with the main method
    public class TriangleDemo {

        public static void main(String[] args) {

            // Create an object of the Triangle class
            Triangle tri = new Triangle();

            // Test the triangle method with different values
            System.out.println("triangle(0) → " + tri.triangle(0));

            System.out.println("triangle(1) → " + tri.triangle(1));

            System.out.println("triangle(2) → " + tri.triangle(2));
        }
    }
}
