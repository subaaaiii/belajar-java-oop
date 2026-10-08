package belajar.java.oop.application;

import belajar.java.oop.data.HelloWorld;

public class HelloWordApp {
    static void main() {
//        pakai anonymous class tanpa buat class nya lebih dahulu, untuk case simple
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello "+name);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("Subairi");

    }
}
