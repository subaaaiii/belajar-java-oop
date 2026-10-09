package belajar.java.oop.application;

import belajar.java.oop.data.LoginRequest;

public class RecordApp {
    static void main() {
        LoginRequest loginRequest = new LoginRequest("Subairi","password");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        loginRequest.sayHello();

        System.out.println(new LoginRequest("Subai"));



    }
}
