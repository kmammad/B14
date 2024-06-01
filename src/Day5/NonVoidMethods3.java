package Day5;

public class NonVoidMethods3 {

    public static void main(String[] args) {

        char whateverReturned = getUppercase('u');

        System.out.println(whateverReturned);

    }


public static char getUppercase(char ch){

    char converted = (char)(ch-32);
    return converted;
}

}
