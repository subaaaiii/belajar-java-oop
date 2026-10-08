package belajar.java.oop.application;

import belajar.java.oop.data.Company;

public class CompanyApp {

    static void main() {
        Company company = new Company();
        company.setName("PZN");

        Company.Employee employee = company.new Employee();
        employee.setName("Subairi");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
}
