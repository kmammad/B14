package Ass28_FinalOOPProject;

import java.io.*;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.*;
public class Bank {

    private List<BankAccount> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccount(Long accountNumber) {

        for (BankAccount account : accounts){

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void removeAccount(Long accountNumber) {

        for (int i = 0; i < accounts.size(); i++){
            BankAccount account = accounts.get(i);
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(i);
                break;
            }
        }
    }

    public void sortAccountsByName(){
        Collections.sort(accounts, Comparator.comparing(BankAccount::getAccountHolder));
    }

    public void sortAccountsByAccountNumber(){
        Collections.sort(accounts, Comparator.comparing(BankAccount::getAccountNumber));
    }

    public void readAccountsFromFile(String fileName) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String accountType = parts[0];
                Long accountNumber = Long.parseLong(parts[1]);
                String accountHolder = parts[2];
                Double balance = Double.parseDouble(parts[3]);

                if (accountType.equals("SavingsAccount")){
                    Double interestRate = Double.parseDouble(parts[4]);

                    SavingsAccount savingsAccount = new SavingsAccount (accountNumber, accountHolder, balance, interestRate);
                    addAccount(savingsAccount);
                } else if (accountType.equals("CheckingAccount")){
                    Double overdraftLimit = Double.parseDouble(parts[4]);

                    CheckingAccount checkingAccount = new CheckingAccount(accountNumber, accountHolder, balance, overdraftLimit);
                    addAccount(checkingAccount);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeAccountsToFile(String fileName) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){

            for (BankAccount account : accounts) {
                bw.write(account.toString());
                bw.newLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public void viewAccounts() {

        for (BankAccount account : accounts){
            System.out.println(account);
        }

    }


}
