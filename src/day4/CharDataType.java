package day4;

public class CharDataType {

    public static void main(String[] args) {

        char cyrillicL = '\u041B';

        System.out.println(cyrillicL); // Л unicode format


        char sameAsChar = 'Л';

        System.out.println(sameAsChar);

        char sameAsNumber = 1051; // decimal value of Л in hexidecimal

        System.out.println(sameAsChar);

    //    char charA = 65; // 65 is a decimal value of 'A' in ASCII table

        char charA = '\u0041'; // \u0041 is a hexadecimal value of 'A' in ASCII table

        System.out.println(charA);

        String smiley = "\uD83D\uDE00"; // smiley emoji

        System.out.println(smiley);







    }


}
