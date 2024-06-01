package Day5;

public class NonVoidMethods {

    public static void main(String[] args) {

        // printRandomDecimal();
        // getRandomDecimal();

//        System.out.println(getRandomDecimal());

        double myRandomDecimal = getRandomDecimal();

        if(myRandomDecimal > 0.5){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
    }

    // Void methods do not return any value when you call them, can't be used to assign value to variable
   // public static void printRandomDecimal() {

     //   System.out.println(Math.random());
   // }

    public static double getRandomDecimal(){ //non-void method needs to have keyword return at the end of methid

    double num = Math.random(); // by default returns 0.0 - 1.0 exluding 1
    return num; // al non-void must end with return
    }

}
