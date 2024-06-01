package Day11;

import java.util.Scanner;

public class EveryFiveMess {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11

      //  int sumOdd = 0;

        for (int i = num1; i <= num2; i +=5) {
            if (num1 % 5 == 0) {
         System.out.print(i + " ");
         //i ++;       ;
            } else {
                //sumOdd = sumOdd + i;
                //System.out.print(i + " ");
                num1 = num1 + 4;
                i +=4;
               System.out.print(i + " ");
            }
         //   System.out.print(i + " ");
        }

       // System.out.print(i);
    }
}


