package Day6;

public class IfEvenOdd {

    public static void main(String[] args) {

        //test your method
        System.out.println(isEven(5));
        System.out.println(isEven(10));
        System.out.println(isEven(34));
        System.out.println(isEven(231));

    }

    //create your method here
    public static boolean isEven(int num){

        if((num % 2) == 0){
            return true;
        }else{
            return false;
        }

    }

//    public static boolean isEven(int num){

 //   return num % 2 == 0;


}


