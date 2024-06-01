package Day11;

public class ReverseWordMess {

    public static void main(String[] args) {
            String str = "Hi how are you handsome";
            String[] arr = str.split(" ");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = reverseWord(arr[i]);
            }

            String result = String.join(" ", arr);
            System.out.println(result);
        }

        public static String reverseWord(String word) {
            char[] chars = word.toCharArray();
            int start = 0;
            int end = chars.length - 1;
            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
            return new String(chars);
        }
    }



