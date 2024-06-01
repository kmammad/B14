package ClassTasks;

public class T22_WhileLoop {

    public static void main(String[] args) {

        // TESTS
        printMessage("Hello" , 5 );
        printMessage("Hello" , 1000 ) ;
        printMessage("Welcome to VA" , 500 );
        printMessage("Loops are powerful" , 25 ) ;
        printMessage("Bye" , 0 ) ;
    }

    // Create your method here
    public static void printMessage(String str, int times){

        int i = 0;

        while (i < times) {
            System.out.println(str + "," + i);
            i++;
        }
    }
}

/**
 * Create a method called printMessage that takes String and int parameters;
 * String represents the message, int represents the number of times.
 * Your method should print out the given String int amount of times;
 *
 * printMessage("Hello" , 5 ) -> prints Hello 5 times
 * printMessage("Hello" , 1000 ) -> prints Hello 1000 times
 * printMessage("Welcome to VA" , 500 ) -> prints Welcome to VA 500 times
 * printMessage("Loops are powerful" , 25 ) -> prints Loops are powerful 25 times
 * printMessage("Bye" , 0 ) -> Nothing should be printed
 *
 * Use a while loop to achieve the task purpose.
 */