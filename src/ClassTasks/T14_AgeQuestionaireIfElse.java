package ClassTasks;

public class T14_AgeQuestionaireIfElse {

    public static void main(String[] args) {

        // call your method here

        printMessage(25);

    }


    public static void printMessage(int age){

        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age >= 16 && age <= 17){
            System.out.println("You can drive but not vote.");
        } else if(age >= 18 && age <= 24){
            System.out.println("You can vote but not rent a car.");
        } else {
            System.out.println("You can do pretty much anything.");
        }

    }
}
/**
 /*
 Create a method called whatYouCanDo() that takes an age as an integer and prints  ONE of the following messages based on the value of the age:

 If the age:

 less than 16 -> "You can't drive."
 16 to 17 -> "You can drive but not vote."
 18 to 24 -> "You can vote but not rent a car."
 25 or older -> "You can do pretty much anything."

 Only one of these messages should be printed.

 */


