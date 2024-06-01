package day4;

public class RandomWholeNumber {

    public static void main(String[] args) {


        int randomNumber = 6 + (int)(Math.random()*5); // 6-11 (11 not inclusive), first shows start number, second number shows the range,

        // without parenthesis around math.random, the result will be 6. as math.result is always 0.232232, int of that will be 0 plus 6 = 6

        System.out.println(randomNumber);
    }


}
