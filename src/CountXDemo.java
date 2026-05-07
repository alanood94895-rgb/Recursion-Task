public class CountXDemo {
    public static void main(String[] args) {

        // Create an object of the CountX class
        CountX counter = new CountX();

        // Test the countX method with different strings
        System.out.println("countX(\"xxhixx\") → " + counter.countX("xxhixx"));
        System.out.println("countX(\"xhixhix\") → " + counter.countX("xhixhix"));
        System.out.println("countX(\"hi\") → " + counter.countX("hi"));
    }
}
