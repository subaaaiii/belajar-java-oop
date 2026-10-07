public class PersonApp {
    static void main() {
        var person1 = new Person();
        person1.name = "Subairi";
        person1.address = "Madura";

        var person2 = new Person("Suki");
        var person3 = new Person("Sudu", "Papua");

//        person1.country = "Malaysia"; //Tidak bisa karena final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Budi");
        person2.sayHello("pace");
        person1.sayHello2("Hela");
        person1.sayHello3("Hela");
    }

}
