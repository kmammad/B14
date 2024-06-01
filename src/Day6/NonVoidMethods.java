package Day6;

public class NonVoidMethods {

    public static void main(String[] args) {

        System.out.println("The Alien 1 name: " + generateAlienName());
        System.out.println("The Alien 2 name: " + generateAlienName());

        divide(10, 0); // results in runtime error (exceptions), return is used in void method to return this method early
    }


public static String generateAlienName(){

    char one = (char)(Math.random()*26 + 'A');
    char two = (char)(Math.random()*26 + 'A');
    String alienName = "" + one + two;

    return alienName;

}

public static void divide(int a, int b){

        if(b==0){
            System.out.println("Division by zero is not allowed. Method call is terminated");
            return; // example of the use return; in void methods to end the execution during dissallowed activtiy like division by 0
            // System.exit (status: 2); ends the execution of the code early with abnormal status code
            // exit code 0 means the execution finished without error
            // anything but 0 means error
            // 2 unrecoverable situation
        }

        System.out.println("Division: " + a/b);

    }

}