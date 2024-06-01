package Assignmenents;

import java.util.*;

public class A27_StackBalancedBrackets {
    public static void main(String[] args) {

        //TESTS
        System.out.println(isBalanced("()")) ; //- true
        System.out.println(isBalanced("((()))")) ; //- true
        System.out.println(isBalanced("([[{{}}]])")) ; //- true
        System.out.println(isBalanced("()(){}{{}}[][[]]")) ; //- true
        System.out.println(isBalanced("[{()}]")); // - true
        System.out.println(isBalanced("({}{}([{}]))"));// - true
        System.out.println(isBalanced("[({(})]")) ; // false
        System.out.println(isBalanced("{[}") );//- false
        System.out.println(isBalanced("({")) ; //- false

    }

    public static boolean isBalanced(String str){

        Stack <Character> stack = new Stack<>();

        for (char ch : str.toCharArray() ) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else
            {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ( ( ch == ')' && top != '(' ) || ( ch == ']' && top != '[' ) || (ch == '}' && top != '{' ) ) {
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }
}

/**
 * Given a string containing only the characters ( ) { } [ ] determine if it is balanced.
 *
 * The string is considered balanced if:
 *
 * Open brackets are closed by the same type of brackets.
 * Open brackets are closed in the correct order.
 *
 * Use Stack data structure for solution.
 */
