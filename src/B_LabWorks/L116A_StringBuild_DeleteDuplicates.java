package B_LabWorks;

public class L116A_StringBuild_DeleteDuplicates {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("abbcccddddeeeee")); // "abcde"
        System.out.println(removeConsecutiveDuplicates("aaaabcccccccccddefffffffffff")); // "abcdef"

    }

    public static String removeConsecutiveDuplicates(String input) {
        // Implement your solution using StringBuilder here

        StringBuilder sb = new StringBuilder(input);

        for (int i = 0, j = i + 1; i < sb.length()-1;) {

            if (sb.charAt(i) == sb.charAt(j)) {
                sb.deleteCharAt(j);

            } else {
                i++;
                j++;
            }
        }

        return sb.toString();
    }

}
