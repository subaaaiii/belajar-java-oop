package belajar.java.oop.utils;

import belajar.java.oop.annotation.NotBlank;
import belajar.java.oop.data.LoginRequest;
import belajar.java.oop.error.BlankException;
import belajar.java.oop.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password tidak boleh blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null){
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username tidak boleh blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("Password tidak boleh blank");
        }
    }
    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if (field.isAnnotationPresent(NotBlank.class)){
                try {
                    String value = (String) field.get(object);
                    if(value == null || value.isBlank()){
                        throw new BlankException("Field "+field.getName()+" is blank");
                    }
                }catch (IllegalAccessException e){
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }

    }
}
