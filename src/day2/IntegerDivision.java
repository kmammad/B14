package day2;

public class IntegerDivision {

    public static void main(String[] args) {


        System.out.println(10/4); // answer is 2 not 2.5 as the rule is integer divided by integer is whole number
        System.out.println(125/10); // answer is 12 not 12.5 as the rule is integer divided by integer is whole number

        //to correct this you need to make at least one of the sides double

        System.out.println(10/4.0); // result 2.5


        // Anything divided by 10 -> to remove the last digit
        int num = 123;
        System.out.println(num / 10); // result 12



    }
}
