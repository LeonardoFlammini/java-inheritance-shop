package org.excercises.javaBank;

public class JavaBank {
    public static void main(String[] args) {
        Conto conto1 = new Conto("Mario");
        Conto conto2 = new Conto("Luigi");
        Conto conto3 = new Conto("Peach");

        conto1.printBillInfo();
        conto2.printBillInfo();
        conto3.printBillInfo();

        conto1.deposit(1000);
        conto1.withdraw(200);
        conto2.deposit(2000);
        conto2.withdraw(500);
        conto3.deposit(3000);
        conto3.withdraw(800);

        conto1.printBillInfo();


        conto1.setUser("Bowser");



        conto1.printBillInfo();
        conto2.printBillInfo();
        conto3.printBillInfo();
    }
}
