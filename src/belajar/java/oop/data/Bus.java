package belajar.java.oop.data;

public class Bus implements Car{
    public void drive(){
        System.out.println("Drive bus");
    }
    public int getTier(){
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance(){
        return true;
    }

    public boolean isBig() {
        return true;
    }
}
