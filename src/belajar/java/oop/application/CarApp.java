package belajar.java.oop.application;

import belajar.java.oop.data.Avanza;
import belajar.java.oop.data.Bus;
import belajar.java.oop.data.Car;

public class CarApp {
    static void main() {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
        System.out.println(car.isBig());

        Car car2 = new Bus();
        car2.drive();
        System.out.println(car2.getTier());
        System.out.println(car2.getBrand());
        System.out.println(car2.isMaintenance());
        System.out.println(car2.isBig());
    }
}
