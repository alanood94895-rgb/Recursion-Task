public class ChangePiDemo {
    public static void main(String[] args) {

        // Create an object of the ChangePi class
        ChangePi changer = new ChangePi();

        // Test the changePi method with different strings
        System.out.println("changePi(xpix)" + changer.changePi("xpix"));
        System.out.println("changePi(pipi)" + changer.changePi("pipi"));
    }
}
