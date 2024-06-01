package ClassTasks;

public class T17_SwitchEverydayMessage {
    public static void main(String[] args) {

        // test the method here

        getMessage("Monday");
        getMessage("Thursday");
        getMessage("Friday");
        getMessage("Sunday");
        getMessage("dsgvcdsg");

    }

    //create the method here

    public static void getMessage(String str) {

        switch(str){

            case "Monday", "Tuesday", "Wednesday", "Thursday":
                System.out.println("Working Hard!!!");
                break;

            case "Friday":
                System.out.println("The weekend is almost here! TGIF!!!");
                break;

            case "Saturday", "Sunday":
                System.out.println("It's party time! Alright, Alright, Alright");
                break;

            default:
                System.out.println ("You partied too hard this weekend!");
                break;
        }

    }

}
/**
 *Create a method that takes a day of the week as a String and prints one of these messages:
 *
 *    Monday-Thursday -> "Working Hard!!!"
 *    Friday -> "The weekend is almost here! TGIF!!!"
 *    Saturday-Sunday -> "It's party time! Alright, Alright, Alright!"
 *    Funday/Dogday/BlaBlaDay/AnythingElse -> "You partied too hard this weekend!"
 *
 * Use switch statement to control the flow of the execution.
 *
 *
 * getMessage("Monday") ->  "Working Hard!!!"
 * getMessage("Thursday") ->  "Working Hard!!!"
 * getMessage("Friday") ->  "The weekend is almost here! TGIF!!!"
 * getMessage("Sunday") ->  "It's party time! Alright, Alright, Alright!"
 * getMessage("dsgvcdsg") -> "You partied too hard this weekend, bro!"
 *
 */
