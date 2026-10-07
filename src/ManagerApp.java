public class ManagerApp {
    static void main() {
        var m = new Manager("subairi");
//        m.name = "Subairi";
        m.sayHello("Yanto");
        var vp = new VicePrecident("Iwan");
//        vp.name = "Iwan";
        vp.sayHello("Parhan");

//      method bawaan object class
        System.out.println(m.toString());
        System.out.println(m);
    }
}
