package B_LabWorks;

public class L117_WrapperClass {

    /**
     *
     * Often as an Automation Engineer we will need to validate information on the UI such as price which is stored as a string and we might want to convert it to a number for proper validation.
     * Create a re-usable method method takes the price as a String and returns a corresponding double number in the given format below. Use regex or string manipulation and wrapper class methods.
     *    Examples:
     *     "$21.98" -> 21.98
     *     "$1,220.02" -> 1220.02
     *     "$1.99" -> 1.99
     *     "$0.21" -> 0.21
     *     "$101,100.50" -> 101100.50
     */

    public static void main(String[] args) {
        //TEST

        System.out.println(convertPrice("$21.98"));
        System.out.println(convertPrice("1,220.02"));
        System.out.println(convertPrice("1.99"));
        System.out.println(convertPrice("0.21"));
        System.out.println(convertPrice("101,100.50"));

    }


    //Create your method here

    public static Double convertPrice(String priceStr){

        String cleanPrice = priceStr.replaceAll("[^0-9.^]", "");


        return Double.parseDouble(cleanPrice);
    }
}
