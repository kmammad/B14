package day3;

public class CoinToss {

    public static void main(String[] args) {

        int randomNo = 0 + (int) (Math.random() * 2);

        System.out.println(randomNo);

        if(randomNo == 0){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }


    }
}
