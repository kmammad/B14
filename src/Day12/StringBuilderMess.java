package Day12;

public class StringBuilderMess {

    public static void main(String[] args) {

     String s = "Hello";
     String t = new String (s);
     if ("Hello".equals(s)) System.out.println("one");

     if (t == s) System.out.println("two");

     if ("Hello" == s) System.out.println("five");
    }
    }

