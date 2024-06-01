package Ass28_FinalOOPProject;

public class SavingsAccount extends BankAccount implements InterestRate{

    private Double interestRate;

    public SavingsAccount (Long accountNumber, String accountHolder, Double balance, Double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {return interestRate;}

    public void setInterestRate(Double interestRate) {this.interestRate = interestRate;}

    @Override
    public double calculateInterest(){
        return getBalance() * this.interestRate;
    }

    @Override
    public void deposit (double amount){ setBalance(getBalance() + amount);}

    @Override
    public void withdraw (double amount) throws InsufficientFundsException {

        if (amount > getBalance()){
            throw new InsufficientFundsException("Withdrawal amount exceeds the account balance");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public String toString(){
        return "Savings Account: " + super.toString() + ", Interest Rate: " + interestRate;
    }

}
