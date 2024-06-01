package Day7;

import java.util.Scanner;

public class MultiwayIfelse {

    public static void main(String[] args) {

        System.out.println("Please enter the student's test score: ");
        int score = new Scanner(System.in).nextInt();

        if(score >= 90){
            System.out.println("A");

        }else if(score >= 80){
            System.out.println("B");

        }else if(score >= 70){
            System.out.println("C");

        }else if(score >= 60){
            System.out.println("D");

        }else{
            System.out.println("F");
        }

    }

}
