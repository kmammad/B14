package Day7;

public class LogicalXOR {

    public static void main(String[] args) {

        // check if number is not divisible by both 3 and 5

        int num = 9;

        if (num % 3 == 0 ^ num % 5 == 0){
            System.out.println("The number is divisible by either 3 or 5"); // true
        }else{
            System.out.println("The number is not divisible by both 3 and 5");
        }

    }
}
