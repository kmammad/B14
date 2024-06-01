package day4;

public class MethodDemo {


    // DRY Principle of programming -> Don't Repeat Yourself
    // method in other languages function is collection of codes, avoid repetition
    // method - collection of statements that perform some operation as a whole
    // method is created in the body of the class and outside of main method

    // step 1 declaring, creating, defining a method
    // public static optional        (void nothing)
    // visibility   belong to class  returntype    name              parameters      body {}
    public        static             void          generatePassword ()               //{}

    {
        char ch1 = (char) (97 + Math.random() * 26);
        char ch2 = (char) (97 + Math.random() * 26);
        char ch3 = (char) (97 + Math.random() * 26);
        char ch4 = (char) (97 + Math.random() * 26);
        char ch5 = (char) (97 + Math.random() * 26);

        System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);



    }

    public static void main(String[] args) {

        //took what i created in main method and stored in my method

        //in Java you can only run Main method

        // Call/Invoke a method

        System.out.println("Before method call...");

        generatePassword();

        System.out.println("After method call....");

        generatePassword();
        generatePassword();
        generatePassword();
        generatePassword();
        generatePassword();

    }





}
