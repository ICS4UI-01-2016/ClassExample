/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class BankAccount {
    
  
    
    // shared between all BankAccounts
    private static int currentAccounts = 0;
    
    // instance variables
    private double amount = 0;
    private int pin = 0000;
    private int accountNumber;
    private String name;
    
    // Constructor
    // initial setup that needs to happen before using
    public BankAccount(String name, int pin, double initBalance){
       this.amount = initBalance;
       this.name = name;
       this.pin = pin;
       
       
       // add 1 to create an account
       BankAccount.currentAccounts++;
       // set the account number
       this.accountNumber = BankAccount.currentAccounts;
    }
    
    // Class Methods
    
    public void withdraw(double amount){
        if(amount > 0 && this.amount >= amount){
            this.amount -= amount;
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            this.amount += amount;
        }
    }
    
    public double checkFunds(){
        return this.amount;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public void transferFundsTo(BankAccount a, double amount){
        // check for proper amount
        if(this.amount >= amount){
            // do the transfer
            this.amount -= amount;
            //this.withdraw(amount);
            a.amount += amount;
            // a.deposit(amount);
        }
    }
    
    
}
