package Day10;

import java.util.Scanner;

public class PracticeStringAssignment {

    public static void main(String[] args) {

        System.out.println("Enter the first name ");
        String name1 = new Scanner(System.in).next();

        System.out.println("Enter the second name ");
        String name2 = new Scanner(System.in).next();

        int length1 = name1.length();
        int length2 = name2.length();

        String evenName = name1.substring(0, length1/2) + name2.substring(length2/2);
        String oddName = name1.substring(0, length1/2) + name2.substring(length2/2+1);


        if(length1 % 2 == 0 || length2 % 2 == 0){
            System.out.println("The Tabloids are going to love this: " + evenName + "!");
        }else{
            System.out.println("The Tabloids are going to love this " + oddName + "!");
        }


    }
}
