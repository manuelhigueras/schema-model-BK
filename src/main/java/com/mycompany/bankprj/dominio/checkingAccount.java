/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.dominio;

public class checkingAccount extends Account{
    Account2 acco;
    private double overdraftAmount;

    public checkingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }
    
    public checkingAccount(double initBalance){
        super(initBalance);
        this.overdraftAmount = 0;
    }
    
    @Override
    public void getWithdraw(double overdraftAmount){
        double balance = this.getBalance();
        if(overdraftAmount > 0 && balance >= overdraftAmount){
            balance -= overdraftAmount;
            System.out.println("Has retirado " + overdraftAmount);
        }
        else{
            System.out.println("No puedes retirar, no tienes dinero.");
        }
    }
    
}
