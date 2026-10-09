package belajar.java.oop.application;

import belajar.java.oop.data.CreateUserRequest;
import belajar.java.oop.utils.ValidationUtil;

public class ReflectionApp {
    static void main() {
        CreateUserRequest user = new CreateUserRequest();
        user.setUsername("");
        user.setPassword("");
        ValidationUtil.validationReflection(user);
        System.out.println("Apakah sukses");
    }
}
