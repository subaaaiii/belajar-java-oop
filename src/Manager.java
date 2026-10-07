class Manager extends Employee{

    Manager(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello "+name+", I'm Manager, My name is "+this.name);
    }


}
