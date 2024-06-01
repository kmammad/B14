package B_Lab101_EncapsSetGet;

public class Main {

    public static void main(String[] args) {

        // Test your class

        Company company = new Company("Miracle Coders");

        company.setNumberOfEmployees(100);
        company.setRevenue(10000);
        company.setExpenses(4000);

        System.out.println("Company name " + company.getName());
        System.out.println("Number of employees " + company.getNumberOfEmployees());
        System.out.println("Company revenue: $" + company.getRevenue());
        System.out.println("Company expenses: $" + company.getExpenses());

        System.out.println(company.getName() + "'s net profit: $" + company.getProfit());
        System.out.println(company.getName() + "'s size is " + company.getCompanySize());
    }


}
