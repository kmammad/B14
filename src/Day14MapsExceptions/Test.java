package Day14MapsExceptions;

import jdk.jshell.spi.ExecutionControl;

public class Test {

    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard (int cardNo) throws RuntimeException {
        System.out.println("Checking card");
    }

    public static void main(String[] args) throws Exception {
        Test ex = new Test();

        int cardNo = 1234;

        ex.readCard(cardNo);
        ex.checkCard(cardNo);
    }
}
