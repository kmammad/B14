package Day5;

public class NonVoidMethodRules {

    public static void main(String[] args) {

    }

    // 1. If a method has some return type other than void, without a return statement it doesn't compile
     // Compiler error: missing return statement
   // 2. Anything after the return statement is a dead code which results in a compiler
     // Compiler error: Unreachable statement

    public static int myMethod(){

        System.out.println(5);
        return 0;
        //System.out.println();



    }




}
