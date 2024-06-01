package ClassTasks;

public class T063_RegexPhoneNum {

    public static void main(String[] args) {
        // Create  a method that checks if a given String matches the correct format for a US phone number.
        // Phone number can't start with zero
        //  202-997-0899  -> true
        //  056-342-2234  -> false
        //  99798456-78956 -> false
        //  231-4562-21 -> false

        System.out.println(checkPhoneNumberFormat("202-997-0899")); //true
        System.out.println(checkPhoneNumberFormat("056-342-2234")); //false
        System.out.println(checkPhoneNumberFormat("99798456-78956")); //false
        System.out.println(checkPhoneNumberFormat2("+1 (231) 456-2218")); //false


    }


    // create the method here
    public static boolean checkPhoneNumberFormat(String phoneNo){

        String phoneNoPattern = "[1-9]\\d{2}-\\d{3}-\\d{4}";

        return phoneNo.matches(phoneNoPattern);
    }

    public static boolean checkPhoneNumberFormat2(String phoneNo){

        String phoneNoPattern = "\\+1 \\([1-9]\\d{2}\\) \\d{3}-\\d{4}";

        return phoneNo.matches(phoneNoPattern);
    }

}
