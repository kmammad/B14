

package Day11;

import java.util.concurrent.ThreadLocalRandom;

public class MinMaxMess {

    public static void main(String[] args) {


        int ran1 = ThreadLocalRandom.current().nextInt(25);

        System.out.println(ran1);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println(max);
        System.out.println(min);


    }
}
