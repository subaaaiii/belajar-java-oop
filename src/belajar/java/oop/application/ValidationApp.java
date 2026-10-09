package belajar.java.oop.application;

import belajar.java.oop.data.LoginRequest;
import belajar.java.oop.error.ValidationException;
import belajar.java.oop.utils.ValidationUtil;

public class ValidationApp {
    static void main() {
        LoginRequest loginRequest = new LoginRequest(null, null);
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException e){
            System.out.println("Terjadi error: "+ e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Terjadi error null: "+e.getMessage());
        }finally {
            System.out.println("Error atau tidak, Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Keburu error");

    }
}
