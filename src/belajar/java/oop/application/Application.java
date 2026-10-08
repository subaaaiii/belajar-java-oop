package belajar.java.oop.application;

//import belajar.java.oop.data.Product;
//import belajar.java.oop.data.Data;

//untuk import semua
import belajar.java.oop.data.*;


public class Application {
    static void main() {
//        bisa karena Product dan Contructor nya public
        Product product = new Product("Sabun", 2000);

//        tidak bisa karena name protected dan price private
//        System.out.println(product.name);
//        System.out.println(product.price);
        Data data =  new Data();
    }
}
