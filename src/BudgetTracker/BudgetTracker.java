package BudgetTracker;

public class BudgetTracker {
    double totalIncome; //: a double to store the total income received.
    double totalExpenses; // a double to track the total amount of expenses.
    double netBalance; // a double to represent the user's net balance after accounting for income and expenses.

    public BudgetTracker(){
        totalExpenses = 0;
        totalIncome = 0;
        netBalance = 0;
    }
    public double getTotalIncome() {
            return totalIncome;
    }

    public double getTotalExpenses() {
            return totalExpenses;
    }

    public double getNetBalance() {
            return netBalance;
    }

//    •	addIncome(double amount): Adds the specified amount to totalIncome and updates netBalance.
//•	logExpense(double amount): Adds the specified amount to totalExpenses and updates netBalance.
//•	calculateNetBalance(): Updates netBalance by subtracting totalExpenses from totalIncome.
//•	getBudgetDetails(): Prints out the current income, expenses, and net balance.

    public void addIncome(double amount){
            totalIncome += amount;
            calculateNetBalance();
    }

    public void logExpense(double amount){
            totalExpenses += amount;
            calculateNetBalance();
    }

    public void calculateNetBalance(){
            netBalance = totalIncome - totalExpenses;
    }
    public String getBudgetDetails() {
            return "BudgetTracker{" +
                    "totalIncome=" + totalIncome +
                    ", totalExpenses=" + totalExpenses +
                    ", netBalance=" + netBalance +
                    '}';
    }
}

