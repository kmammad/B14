package Day12;

public class StringPool {
    public static void main(String[] args) {

        String s = "Hello";

        String t = new String(s);

        if ("Hello".equals(s)) System.out.println("one"); //one
        if (t == s) System.out.println("two"); // FALSE
        if (t.equals(s)) System.out.println("three"); // three
        if ("Hello" == s) System.out.println("four"); // four
        if ("Hello" == t) System.out.println("five"); // FALSE


    }
}
