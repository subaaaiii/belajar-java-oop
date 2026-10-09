package belajar.java.oop.application;

public class StackTraceApp {
    static void main() {
//        try {
//            String[] names= {"Subairi", "JOKO", "Budi"};
//            System.out.println(names[100]);
//        }catch (Throwable throwable){
//            throwable.printStackTrace();
//        }

        try {
            sampleError();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }

    static void sampleError() {
        try {
            String[] names= {"Subairi", "JOKO", "Budi"};
            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
