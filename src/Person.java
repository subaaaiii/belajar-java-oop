class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }
//    dapat melakukan Constructor overloading
//    dapat memanggil Constructor lain
    Person(String paramName){
        this(paramName, null);
    }

    Person(){

    }
    void sayHello(String paramName){
        System.out.println("Hello "+paramName+", My Name is "+name);
    }
//    variabel shadowing, name akan menutupi akses name yang ada di class
    void sayHello2(String name){
        System.out.println("Hello "+name+", My Name is "+name);
    }

//    penggunaan this untuk mengakses object saat ini, bisa untuk mengatasi varriable shadowing,
//    jadi this.name akan mengacu pada name Person bukan name parameter
    void sayHello3(String name){
        System.out.println("Hello "+name+", My Name is "+this.name);
    }

}
