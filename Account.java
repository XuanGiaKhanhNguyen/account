/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;


/**
 *
 * @author giakhanh
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account acc1 = new Account(123);
        //System.out.println(acc1);
        acc1.debit(500);
        
        
    }
    
    private int accountNumber;
    private double balance = 0.0;
    
    
    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }   
    
    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    
   
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void credit(double amount){
        this.balance+=amount;
    }
    
    public void debit(double amount){
        if(balance >= amount)
            this.balance-= amount;
        else
            System.out.println("amount withdrawn exceeds the current balance!!!");
    }
    
    public String toString(){
        return String.format("A/C number: %d , Balance: %.2f",accountNumber,balance);
    }
}
