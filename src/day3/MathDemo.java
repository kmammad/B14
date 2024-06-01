package day3;

public class MathDemo {

    public static void main(String[] args) {

        System.out.println(Math.PI * 3.4 * 3.4);

        // ClassName.methodName() -> Math.random();

        int abs = Math.abs(-2); // returns absolute value of integer, to see the overall difference between two numbers

        int a = 32;
        int b = 20;

        System.out.println("The difference is: " + Math.abs(b-a));


        double value = 23.99;

        long result = Math.round(value);

        System.out.println(result);

        double result1 = Math.pow(2, 10);
        System.out.println(result1);

        double sqrt = Math.sqrt(81);
        System.out.println(sqrt);

        System.out.println(Math.cos(180));




    }
}
