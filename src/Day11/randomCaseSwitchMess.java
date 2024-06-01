package Day11;

public class randomCaseSwitchMess {

    public static void main(String[] args) {

        System.out.println(getRandomCreditCardNo(1));
        System.out.println(getRandomCreditCardNo(2));
        System.out.println(getRandomCreditCardNo(3));
        System.out.println(getRandomCreditCardNo(4));
        System.out.println(getRandomCreditCardNo(0));
        System.out.println(getRandomCreditCardNo(2330));


    }

    public static String getRandomCreditCardNo(int number){

        String str;

        long randomNumber15 = (long)(Math.random()*900000000000000L + 100000000000000L);

        switch (number){
            case 1:
                str = "3" + randomNumber15;
                break;
            case 2:
                str = "4" + randomNumber15;
                break;
            case 3:
                str = "5" + randomNumber15;
                break;
            case 4:
                str = "6" + randomNumber15;
                break;
            default:
                return "0";

        }

return str;
    }




}
