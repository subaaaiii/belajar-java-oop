package belajar.java.oop.data;

public class ProductApp {
    static void main() {
        Product product = new Product("Sabun", 2000);

//        bisa karena name nya protected
        System.out.println(product.name);
//        tidak bisa karena  price private
//        System.out.println(product.price);

        System.out.println(product);

        Product product2 = new Product("Sabun", 2000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
