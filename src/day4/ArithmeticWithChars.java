package day4;

public class ArithmeticWithChars {

    public static void main(String[] args) {

        char ch = 'A';

        ch++;

        System.out.println(ch); // result will be B


        // char is compatible with int -> long -> float -> double for type implicit casting

        int num = 'a'; // char is assignable to int or greater than int directly

        System.out.println(num); // result 97

        char ch2 = 1060;

        System.out.println(ch2); // Ф in cyrillic

        // to assign byte or short to char you need to perform casting
        // anything smaller int ; byte, small, char are promoted to int while conducting operation

        // type promotion

        System.out.println('a' + 'b'); // result 195 as these chars promoted to int and their ASCII value is used 97+98

        char ch3 = 'a' + 'b';

        System.out.println(ch3); // result Ã

        char ch4 = 'a';
        char ch5 = 'b';
        char ch6 = 'c';

        System.out.println(ch4 + ch5 + ch6); // you want abc but get 195, Ã, 294

        System.out.println("" + ch4 + ch5 + ch6); // to have abc change it to String - concatenated as strings

        System.out.println((int)'X'); // will be 88
        System.out.println((char)1099); // will be ы
        System.out.println((char)2000.56); // will be ߐ, whatever whole number of the decimal will be converted to the corresponding character

        // Generate a random char of lowercase chars a-z

        int someNum = 97 + (int)(Math.random() * 26); //122-97=25 to include z we should add 1, 26 characters more

        System.out.println(someNum); // random whole number within range of character 115

        System.out.println((char)someNum); // to have letter not number, this needs to be casted to char

        char someChar = (char)(Math.random() * 26 + 97);

        System.out.println(someChar);

        char someCharUp = (char)(Math.random() * 26 + 65); // upper case A - Z, 65 - 90 - 26
        System.out.println(someCharUp);


        String str = "A";
        System.out.println(str.toLowerCase()); // to change to lower case



















    }
}
