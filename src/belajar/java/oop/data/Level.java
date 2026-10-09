package belajar.java.oop.data;

public enum Level {
//    STANDARD,
//    PREMIUM,
//    VIP;

//    saat membuat constructor, maka parameter harus lang di definisikan
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;
    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
