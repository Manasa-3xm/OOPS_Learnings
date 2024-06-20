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
        Dog dog = new Dog();
        dog.eat();
        Overloading overloading = new Overloading();
        overloading.display(1);
        overloading.display("hi");
        Overriding overriding = new Dog.Cat();
        overriding.makeSound();
        Overriding overriding1 = new Dog.Bird();
        overriding1.makeSound();
        Circle circle = new Circle();
        circle.draw();
        Circle.Rectangle rectangle = new Circle.Rectangle();
        rectangle.draw();
        Abstract_Animal dog2 = new Dog1();
        dog2.makeSound();
        dog2.eat();
        Employee employee = new Employee("John Doe", 13, 50);
        employee.setSalary(55550);
        System.out.println("Emp Info:" + employee.getName() + "," + employee.getAge() + "," + employee.getSalary());
    }
}
