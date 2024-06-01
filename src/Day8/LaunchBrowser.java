package Day8;

public class LaunchBrowser {

    public static void main(String[] args) {

        String browser = "safari";


        if(browser.equals("chrome")){
            System.out.println("Launching Firefox");
        }else if (browser.equals("firefox")){
            System.out.println("Launching Firefox");
        }else if (browser.equals("edge")){
            System.out.println("Launching Edge");
        }else if (browser.equals("safari")){
            System.out.println("Launching Safari");
        }else {
            System.out.println("invalid browser");
        }


    }



}
