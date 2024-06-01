package Day7;

public class CombiningLogicalOperators {

    public static void main(String[] args) {

        System.out.println(true && false || false); //&& has more precedence than || like multiplication over adding
        System.out.println(true && false || true && true);
        System.out.println(true && (false || true) && true);

    }
}
