package belajar.java.oop.data;

public class Avanza implements Car{
    public void drive(){
        System.out.println("Drive avanza");
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
}
