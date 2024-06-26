package org.example.membervariables;

public class MemberVariables {
    public static int tyres = 5;

    //local vs instance vs class/static
    public static void main(String[] args) {
        Car car = new Car();
        car.display(1235689);
        Car car1 = new Car("red");
        car1.visual();
        car.tyres();
    }

    public static class Car {
        public String color;

        public Car() {
        }

        public Car(String color) {
            this.color = color;
        }

        //instance variable
        public void visual() {
            System.out.println("color of the car is " + color);
        }

        public void display(int m) {
            int model = m;
            System.out.println("Model of the car is " + model);
        }

        //static
        public void tyres() {
            tyres = 4;
            System.out.println("No of tyres are " + tyres);
        }

    }
}
