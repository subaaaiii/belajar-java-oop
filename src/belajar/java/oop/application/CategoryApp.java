package belajar.java.oop.application;

import belajar.java.oop.data.Category;

public class CategoryApp {
    static void main() {
        Category category = new Category();
        category.setId(null);
        System.out.println(category.getId());
        category.setId("1");
        System.out.println(category.getId());
        category.setExpensive(true);
        System.out.println(category.isExpensive());


    }
}
