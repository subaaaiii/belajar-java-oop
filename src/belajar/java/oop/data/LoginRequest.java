package belajar.java.oop.data;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Membuat object loginrequest");
    }
//        Method overloading
    public LoginRequest(String username){
        this(username, "");
    }
    public LoginRequest(){
        this("","");
    }

    public void sayHello(){
        System.out.println("Hello"+username);
    }

}
