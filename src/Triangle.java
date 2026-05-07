public class Triangle {

        int triangle(int n) {

            // Base case: no rows means 0 blocks
            if (n == 0) {
                return 0;
            }

            // Add the current row number and continue recursion
            return n + triangle(n - 1);
        }
    }


