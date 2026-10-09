package belajar.java.oop.application;

import belajar.java.oop.data.Customer;
import belajar.java.oop.data.Level;

public class EnumApp {
    static void main() {
        Customer customer = new Customer();
        customer.setName("Subairi");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print out semua level:");
        for(var value: Level.values()){
            System.out.println(value);
        }
    }
}
