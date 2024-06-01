package Day6;

public class Equality {

    public static void main(String[] args) {

        int num = 89; // types must be compatible

        System.out.println(num == 90);
        System.out.println(num == 100-11);
        System.out.println("ALR".equals("alr"));

        boolean b = true;

        System.out.println(b = true == false); // = is an assignment and evaluated after equal operator, so the result is False
        System.out.println( 10 != 20);
        System.out.println( 10 != 10); // !0 not equals, you can use to determine if number is even or odd

    }
}
