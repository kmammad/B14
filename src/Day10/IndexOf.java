package Day10;

public class IndexOf {

    public static void main(String[] args) {

        String str = "Leo loves burgers";

        // index of a char

        int indexOfFirstE = str.indexOf('e'); // only the first occurence
        System.out.println(indexOfFirstE);

        int indexOfSecondE = str.indexOf('e', 2);

        System.out.println(indexOfSecondE);

        int indexOfBurger = str.indexOf("burger");

        System.out.println(indexOfBurger);

        String text = "Hello this is Joe. This is a greeting";

        System.out.println(text.indexOf("is"));
        System.out.println(text.lastIndexOf("is"));

        // given a Full Name(Harry Styles)
        // First name and last name store separately




    }
}
