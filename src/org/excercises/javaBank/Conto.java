package org.excercises.javaBank;

import java.util.Random;

public class Conto {

    Random random = new Random();

    private int bill_id;
    private String user;
    private double balance;

    public Conto(String user){
        this.user = user;
        this.bill_id = random.nextInt(0,99999);
        this.balance = 0.0;
    }

    //getter
    public String getUser(){
        return this.user;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getBill_id(){
        return this.bill_id;
    }


    //setter
    public void setUser(String user){
        this.user = user;
    }

    //metodi
    public int deposit(double ammount){
        if(ammount>0){
            this.balance += ammount;
            return 1;
        }else {
            return 0;
        }
    }
    public int withdraw(double amount) {
        if(amount > 0 && this.balance - amount >= 0) {
            this.balance -= amount;
            return 1;
        } else {
            return 0;
        }
    }


    public void printBillInfo(){
        System.out.printf("Conto nr: %05d\nIntestatario: %s\nSaldo: %.2f euro\n\n",this.bill_id,this.user,this.balance);
    }

}
