package Ass28_FinalOOPProject;

public class CheckingAccount extends BankAccount {

    private Double overdraftLimit;

    public CheckingAccount (Long accountNumber, String accountHolder, Double balance, Double overdraftLimit){
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public Double getOverdraftLimit() {return overdraftLimit;}

    public void setOverdraftLimit(Double overdraftLimit) {this.overdraftLimit = overdraftLimit;}

    @Override
    public void deposit (double amount){
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw (double amount) throws InsufficientFundsException {

        if (getBalance() + overdraftLimit < amount){
            throw new InsufficientFundsException("Withdrawal amount exceeds overdraft limit");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return "Checking Account: " + super.toString() + ", Overdraft Limit: " + overdraftLimit;
    }

}
