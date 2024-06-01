package Day10;

public class ReplaceMethod {

    public static void main(String[] args) {

        String str = "Talk is cheap. Show me the code. ";

        // System.out.println(str.replace('.', ','));
        // System.out.println(str.replace('i', 'e'));
        // System.out.println(str.replace('e', 'a'));

       // System.out.println(str.replace("Talk", "Word"));

        //chain method call

        String replaceVersion = str.replace("is", "es").replace("code", "method");

        System.out.println(replaceVersion);
        System.out.println(str);






    }
}
