public class VicePrecident extends Manager{

//    Wajib ada constructor jika di parent punya constructor yang punya parameter
//    jika di parent punya 2 constructor(overloading) bebas pilih mana aja
    VicePrecident(String name){
        super(name);
    }
//    Method overriding
    void sayHello(String name){
        System.out.println("Hello "+name+", I'm Vice Precident, My name is "+this.name);
    }
}
