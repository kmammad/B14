package Day7;

public class LogicalNegation {

    public static void main(String[] args) {

        System.out.println(!true);
        System.out.println(!false);

        int num = 7;

        if(!(num % 2 == 0)){
            System.out.println("Odd");
        }

        String name = "John";

        if(!name.equals("John")){
            System.out.println("student");
        }

    }
}
