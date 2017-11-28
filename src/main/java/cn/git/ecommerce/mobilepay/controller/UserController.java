package cn.git.ecommerce.mobilepay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public String showUser() {
        return "hello sir !";
    }
}
