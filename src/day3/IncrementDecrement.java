package day3;

public class IncrementDecrement {

    public static void main(String[] args) {

        int number = 45;

        number = number + 5;

        number +=5;

        //number++;

        number--;


        System.out.println(number);

        int i = 5;

        // Pre -> increment first and then use
 //       System.out.println(++i);

        // Post -> first use original value, then increment
        System.out.println(i++);
        System.out.println("After incrementing: " + i);


        int x = 4;
        int y = 7;

        int z = ++x + y++;

        System.out.println(z);

        int a = 7;

        int b = a++ + ++a + --a + a-- + --a; // 7 + 9 + 8 + 8 + 6 = 38

        System.out.println(b);


        int X = 3;
        int Y = ++X + ++X * X--;

        System.out.println(Y);
        System.out.println(X);





    }
}
