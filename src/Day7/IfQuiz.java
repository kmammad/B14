package Day7;

public class IfQuiz {

    public static void main(String[] args) {

        System.out.println(sell(11));

    }

public static int sell(int price){

    if(price < 10){
        price++;
        return price;
    }else{
        price--;
        return price;
    }

}

}

