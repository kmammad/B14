package Day5;

public class MethodParameter {

    public static void main(String[] args) {

        printHello();
        printGreeting("Hello");

    }

    // Method parameters are a way to use the method with different values

    public static void printHello(){
        System.out.println("Hello");

    }

public static void printGreeting(String str){
    System.out.println(str);

}

}
