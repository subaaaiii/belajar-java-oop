public class PolymorphismApp {
    static void main() {
        Employee employee =  new Employee("Subairi");
        employee.sayHello("everyone");

        employee = new Manager("Rifki");
        employee.sayHello("Yanto");

        employee = new VicePrecident("Parhan");
        employee.sayHello("Ripen");

        sayHello(new Employee("UUS"));
        sayHello(new Manager("IIS"));
        sayHello(new VicePrecident("AAS"));

    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePrecident){
            VicePrecident vicePrecident = (VicePrecident) employee;
            System.out.println("Hello VP "+vicePrecident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello MANAGER "+manager.name);
        }else{
            System.out.println("Hello EMPLOYEE "+employee.name);
        }
    }
}
