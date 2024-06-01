package Day8;

public class SwitchCanNotBeBoolean {

    public static void main(String[] args) {

        String flag = "ture";

        switch (flag){
            case "true":
                System.out.println("true");
            default:
                System.out.println("false");
        }


    }


}
