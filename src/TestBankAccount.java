/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class TestBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Lamont", 1234, 100);
        System.out.println("Initial balance: " + a1.checkFunds());
        System.out.println("A1 account: " + a1.getAccountNumber());
        a1.deposit(1000);
        System.out.println("Balance: " + a1.checkFunds());
        a1.withdraw(300);
        System.out.println("Balance: " + a1.checkFunds());
        
        BankAccount a2 = new BankAccount("Another", 1234, 1000);
        System.out.println("A2 balance: " + a2.checkFunds());
        System.out.println("A2 account: " + a2.getAccountNumber());
        a1.transferFundsTo(a2, 100);
        System.out.println("A1 balance: " + a1.checkFunds());
        System.out.println("A2 balance: " + a2.checkFunds());
        
    }
    
}
