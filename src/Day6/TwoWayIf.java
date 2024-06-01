package Day6;

public class TwoWayIf {

    public static void main(String[] args) {

        int radius = -5;

        if (radius > 0) {
            System.out.println("The area of a circle is " + Math.PI * radius * radius);
        } else {
            System.out.println("The radius cannot be 0 or negative");

        }

    }
}
