package belajar.java.oop.application;

import belajar.java.oop.data.Company;
import belajar.java.oop.data.Country;
import belajar.java.oop.utils.MathUtil;

import static belajar.java.oop.data.Application.PROCESSOR;

import static belajar.java.oop.data.Constant.*;

public class StaticApp {
    static void main() {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(PROCESSOR);

        System.out.println(MathUtil.sum(5,5,5,5,10));

        Country.City city = new Country.City();
        city.setName("Surabaya");

        System.out.println(city.getName());
    }
}
