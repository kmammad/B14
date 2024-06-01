package Ass28_FinalOOPProject;

public abstract class BankAccount {
    private Long accountNumber;
    private String accountHolder;
    private Double balance;

    public BankAccount (Long accountNumber, String accountHolder, Double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Long getAccountNumber () { return accountNumber; }

    public void setAccountNumber(Long accountNumber){ this.accountNumber = accountNumber; }

    public String getAccountHolder() { return accountHolder; }

    public void setAccountHolder(String accountHolder){this.accountHolder = accountHolder; }

    public Double getBalance() {return balance; }

    public void setBalance (Double balance) { this.balance = balance; }

    public abstract void deposit (double amount);

    public abstract void withdraw (double amount) throws InsufficientFundsException;

    @Override
    public String toString(){
        return "Account Number " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance;
    }

}

