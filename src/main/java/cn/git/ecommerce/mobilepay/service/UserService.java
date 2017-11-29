package cn.git.ecommerce.mobilepay.service;

public class UserService {
    public String getUserById(int id){
        String strId = String.valueOf(id);
        return "user id is :"+strId;
    }
}
