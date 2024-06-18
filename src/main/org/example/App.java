package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello !");
        BankAccount bankAccount = new BankAccount(23456.3);
        bankAccount.deposit(1234);
        bankAccount.withdraw(230);
        System.out.println(bankAccount.getBalance());
        Car car = new Car();
        car.move();
        Bike bike = new Bike();
        bike.move();
    }
}
