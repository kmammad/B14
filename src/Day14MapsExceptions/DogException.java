package Day14MapsExceptions;

public class DogException {
    public String name;
    public void parseName(){
        System.out.println('1');
        try {
            System.out.println("2");
            int x = Integer.parseInt(name);
            //System.out.println(9/0);
            System.out.println("2");
        } catch (NumberFormatException e){
            System.out.println("4");
        }
    }

    public static void main(String[] args) {
        DogException leroy = new DogException();
        leroy.name = "Leroy";
        leroy.parseName();

        System.out.println("5");

        // Why did the program continue implementing the program???
    }


}
