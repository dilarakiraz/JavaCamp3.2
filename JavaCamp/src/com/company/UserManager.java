package com.company;

public class UserManager {
    public void login(User user){
        System.out.println(user.getId()+ " kullanıcı sisteme giris yapti");
    }
    public void logOut(User user){
        System.out.println(user.getId()+ " kullanici sistemden cikis yapti");
    }
    public void signUp(User user){
        System.out.println(user.getId()+ "kullanici sisteme kaydoldu");
    }
}
