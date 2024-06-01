package day4;

public class EscapeChars {

    public static void main(String[] args) {

        System.out.println("Robot said \"Hello World\" and opened its eyes."); // use \ for escape sequence, before the character
        System.out.println("Robot said 'Hello World' and opened its eyes.");
        System.out.println("Robot said \"\"\"Hello World\"\"\" and opened its eyes.");

        System.out.println("C:\\Users\\Downloads\\file.txt"); //System.out.println("C:\Users\Downloads\file.txt");

// Common escape chars are \" and \\

        System.out.println("\\\\\\///"); // print \\\///



        // \n = Linefeed \uu000A //10 , divides execution lines to the next

        System.out.println("Hello\nWorld\nHi\nUniverse");

        System.out.println("AGE: " + 25);
        System.out.println("NAME: " + "Alex");
        System.out.println("OCCUPATION: " + "DEV");

        System.out.println("AGE: " + 25 + "\n"  +
                "NAME: " + "Alex" + "\n" +
                        "OCCUPATION: " + "DEV"
        );

        // \t = Tab \u0009 9 to print with correct alignment

        System.out.println("AGE\t\t\t25");
        System.out.println("NAME\t\tAlex");
        System.out.println("OCCUPATION\tDEV");




        // \b = Backspace \u0008 8
        // \f = formfeed \u000C 12
        // \r = Carriage Return \u000D //13
        // \\ = backslash \u005C 92
        // \" = Double Quote \u0022 34



    }
}
