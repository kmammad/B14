package Day11;

import java.util.Scanner;

public class EvenOddMess {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11

        int sumOdd = 0;

        for (int i = num1; i <= num2; i+= 2) {
            if (num1 % 2 == 0) {
                num1 = num1 + 1;
                i +=1;
                System.out.print(i + " ");;
            } else {
                //sumOdd = sumOdd + i;
                System.out.print(i + " ");
            }
        }
       // System.out.print(sumOdd);
    }
}

