public class CountXDemo {
    public static void main(String[] args) {

        CountX counter = new CountX();

        System.out.println("countX(xxhixx)  " + counter.countX("xxhixx"));
        System.out.println("countX(xhixhix)  " + counter.countX("xhixhix"));
        System.out.println("countX(hi) " + counter.countX("hi"));
    }
}
