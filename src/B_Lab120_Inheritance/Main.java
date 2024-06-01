package B_Lab120_Inheritance;

public class Main {

    public static void main(String[] args) {
        //Test your class here

        CalculatorWithMemory casio = new CalculatorWithMemory();

        casio.setAccumulator(32);

        System.out.println(casio.getAccumulator());

        casio.save();
        System.out.println(casio.getMemory());

        casio.recall();
        System.out.println(casio.getMemory());

        casio.clearMemory();
        System.out.println(casio.getMemory());

    }
}
