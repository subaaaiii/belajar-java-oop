package belajar.java.oop.application;

public class EqualsApp {
    static void main() {
        String first = "Eko";
        first = first +" "+ "Khannedy";

        String second = "Eko Khannedy";

        System.out.println(first == second);

        String third = "Eko Khannedy";

        System.out.println(second == third);
    }
}
