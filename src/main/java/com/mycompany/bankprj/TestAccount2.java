/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj;

public class TestAccount2 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        double var, necesito;
        
        Account person = new Account(100);

        person.getDeposit(200);
        
        person.getWithdraw(20);
        
        person.getDeposit(100);

        var = person.getBalance();
        
        System.out.println("Tienes en tu cuenta " + var + "$.");
        
        //1. extrae import negativo   
        necesito = 100;
        person.getWithdraw(necesito);
        
        //2. extrae import saldo suficiente
        necesito = 100;
        person.getWithdraw(necesito);
        
        System.out.println(person.toString());
        
        
    }
    
}
