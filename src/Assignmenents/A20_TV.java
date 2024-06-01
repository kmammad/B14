package Assignmenents;

public class A20_TV {
    boolean isOn;
    int currentVolume;
    int currentChannel;
    final int maxVolume = 100;
    final int minVolume = 0;


    public A20_TV(){
        isOn = false;
        currentVolume = 99;
        currentChannel = 1;
    }

    public void powerToggle(){
        isOn = !isOn;
        if(!isOn){
            System.out.println("Turning off the TV.");
        } else {
            System.out.println("Turning on the TV.");
        }
    }

    public void volumeUp(){

        if (isOn && currentVolume < maxVolume) {

            currentVolume ++;
            System.out.println("Volume increased to " + currentVolume);
        } else if (isOn && currentVolume >= maxVolume){
            currentVolume = maxVolume;
            System.out.println("Volume at maximum level " + currentVolume);
        }
    }

    public void volumeDown(){
        if (isOn && currentVolume > minVolume) {
            currentVolume --;
            System.out.println("Volume decreased to " + currentVolume);
        }
    }

    public void channelUp(){

        if (isOn) {

            currentChannel ++;
            System.out.println("Channel changed / increased to " + currentChannel);
        }
    }

    public void channelDown(){

        if (isOn && currentChannel > 1) {

            currentChannel --;
            System.out.println("Channel changed / decreased to " + currentChannel);
        }
    }

    public void setChannel(int newChannel){
        if (isOn) {
            currentChannel = newChannel;
            System.out.println("Current channel changed / set to " + currentChannel);
        }
    }

    public void displayStatus(){
        System.out.println("TV Status: ");
        System.out.println("Power: " + (isOn ? "On" : "Off"));
        System.out.println("Volume: " + currentVolume);
        System.out.println("Channel: " + currentChannel);
    }
}
