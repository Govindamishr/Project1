package com.AtmProject;

public class Atm {
    private double balance;
    private double depositeAmount;
    private double withDrawAmount;

     // default Constructor;
       public Atm(){

       }
       // getter Setter
       public double getBalance(){
        return balance;
       }
       public void setBalance(double balance){
        this.balance=balance;
       }

       public double getDepositeAmount(){
        return depositeAmount;
       }
       public void setDepositeAmount( double depositeAmount){
        this. depositeAmount= depositeAmount;
       }
       public double getWithDrawAmount(){
        return withDrawAmount;
       }
       public void setWithDrawAmount( double withDrawAmount){
        this. withDrawAmount= withDrawAmount;
       }


    
}
