package Day11;

public class RuntimeErrorMess {
    public static void main(String[] args) {

         int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j){

        sum = sum + i + j;
        }

        System.out.println("sum = " + sum);



    }
}
