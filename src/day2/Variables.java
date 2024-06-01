package day2;

public class Variables {

    public static void main(String[] args) {

        int x = 56;
        int y = 23;
        int z = x * y - x + y;

        System.out.println(z); //1255

        z = 100; // re-assignment

        System.out.println(z); // 100

        z = x; // should be compatible with the type of variable

        System.out.println(z); //56

        z = z + z;

        System.out.println(z); //112

        System.out.println("---------------------------");

        int a = 11;
        int b = 3;
        int c = 5;

        a = b;
        b = c;
        c = a;
        c = b;

        System.out.println(a); // 3
        System.out.println(b); // 5
        System.out.println(c); // 5




    }
}
