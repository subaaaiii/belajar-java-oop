package belajar.java.oop.data;

public class SocialMedia {
    final void login(String username, String password){
//        method
    }
}
final class Facebook extends SocialMedia {
//    error karena metod login dari parent sudah final
//    void login(String username, String password){
//
//    }
}

//error karena facebook sudah final
//class fakeFacebook extends Facebook{
//
//}
