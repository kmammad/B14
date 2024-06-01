package Day9;

public class ComparisonMethodsString {

    public static void main(String[] args) {

        String str = "Leo loves burger";

        boolean leoLovesBurger = str.equals("Leo loves burger");

        System.out.println(leoLovesBurger);

        System.out.println(str.equalsIgnoreCase("Leo Loves Burgers"));
        //never use == to compare Strings
        // == should not be used with any objects, only with primites
        // == when used with Strings, compares the memory location of the objects

        String str1 = new String ("Hello");
        String str2 = "Hello";

        if(str1 == str2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal"); // this will be return value
        }

        System.out.println("abc".compareTo("abc")); // returns 0 (type int) - used to sort things, not manipulate strings
        System.out.println("abc".compareTo("bbc")); // returns -1
        System.out.println("bbc".compareTo("abc")); // returns 1 as b comes after 1
        System.out.println("a".compareTo("z")); // returns -25 the difference between these characters in ASCII table

        if(str.startsWith("Leo")){

        }

        System.out.println(str.startsWith("Leo")); // returns true
        System.out.println(str.startsWith("Leo l")); // returns true
        System.out.println(str.endsWith("rs")); // returns false
        System.out.println(str.contains("e r s")); // returns false







    }
}
