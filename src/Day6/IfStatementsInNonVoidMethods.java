package Day6;

public class IfStatementsInNonVoidMethods {

    public static void main(String[] args) {

        System.out.println(isPositive(-23));

    }


    public static boolean isPositive(int num){

        if(num >=0){
            return true;
        }else{
            return false;
        }


    }



}
