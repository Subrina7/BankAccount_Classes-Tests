package org.example;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;


    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0 ;

    }

    public void deposit(int amount){
        this.balance += amount;

    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

   public void interest(double interestRate){
        this.balance += (interestRate/100 * this.balance);
   }

//   this.balance *= (1 + (interestRate/100))

    public void setFirstName(String newName){
        this.firstName = newName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String newLastname){
        this.lastName =newLastname;
    }
    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
