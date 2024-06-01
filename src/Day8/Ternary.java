package Day8;

public class Ternary {

    public static void main(String[] args) {

        // unary operator - you only need one value to operate on

       // int num = 78;
       // System.out.println(num);

        // binary operators  - require two values


      //  int num2 = 56;
       // System.out.println(num + num2);
      //  System.out.println(num > num2);
      //  System.out.println(num > num2 && num == num2);


        // only 1 ternary operator in java
        // ? :

//        int age = 60;
//        double discount;

       // if(age > 55){
         //   discount = 0.1;
       // }else {
        //    discount = 0.5;
       // }

      //  System.out.println("The discount applied is: " + discount);

        // ternary operator
        // condition ? :
        // (age > 55) ? 0.1: 0.05

        int age = 45;

        double discount = age > 55 ? 0.1 : 0.05;

        System.out.println("The discount applied is: " + discount);

        // you can assign to variable or print it on print line statement

        // can be nested

        double discount1 = age > 55 ? age > 100 ? 0.2 : 0.1: 0.05;

        System.out.println("The discount applied is: " + discount);
    }
}
