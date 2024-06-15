package day15;

public class AllPermutations {
    public static void main(String[] args) {

 printPermutation("Dr", "Molder");

    }

    public static void printPermutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                printPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

}
