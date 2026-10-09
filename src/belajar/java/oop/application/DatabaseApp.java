package belajar.java.oop.application;

import belajar.java.oop.error.DatabaseError;

public class DatabaseApp {
    static void main() {
        connectDatabase(null, null);
        System.out.println("Keburu error");
    }
    public static void connectDatabase(String username, String password){
        if(username == null | password==null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
