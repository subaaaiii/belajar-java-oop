package belajar.java.oop.application;

import belajar.java.oop.data.City;
import belajar.java.oop.data.Location;

public class LocationApp {
    static void main() {
//        tidak bisa karena location berupa abstract
//    Location location = new Location();

        City city = new City();
        city.name = "jakarta";
        System.out.println(city.name);
    }
}
